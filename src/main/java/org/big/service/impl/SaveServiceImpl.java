package org.big.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.big.common.result.BaseResults;
import org.big.common.result.BaseResultsEnum;
import org.big.common.result.BaseResultsUtil;
import org.big.entity.Description;
import org.big.entity.Multimedia;
import org.big.entity.Refs;
import org.big.repository.DescriptionRepository;
import org.big.repository.MultimediaRepository;
import org.big.repository.RefsRepository;
import org.big.repository.TraitdataRepository;
import org.big.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

/**
 * <p><b>SaveServiceImpl</b></p>
 * <p> </p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfo Group) - 中国科学院动物研究所生物多样性信息学研究组</p>
 *
 * @Author NY
 * @Date: 2022/7/4 10:27
 * @Version V1.0
 * @since JDK 1.8.0_162
 */
@Service
@SuppressWarnings("all")
public class SaveServiceImpl implements SaveService {


    @Autowired
    private DescriptionRepository descriptionRepository;

    @Autowired
    private MultimediaRepository multimediaRepository;

    @Autowired
    private RefsRepository refsRepository;

    @Autowired
    private TraitdataRepository traitdataRepository;


    @Override
    public BaseResults saveData(String data) {
        try {

            JSONObject json = JSON.parseObject(data);
            JSONObject taxon = json.getJSONObject("taxon");

            // 拉丁名
            String sciname = taxon.getString("sciname");
            // 中文名
            String chname = taxon.getString("chname");
            //
            String authorship = taxon.getString("authorship");
            //  分类等级拉丁名
            String ranken = taxon.getString("rankEn");
            //  分类等级中文名
            String rankcn = taxon.getString("rankCn");

            //   描述信息
            JSONArray descriptionList = json.getJSONArray("descriptionList");
            if (!CollectionUtils.isEmpty(descriptionList)){
                for (Object o : descriptionList) {
                    Description description = JSON.parseObject(o.toString(), Description.class);
                    description.setSciname(sciname);
                    description.setChname(chname);
                    description.setAuthorship(authorship);
                    description.setRankEn(ranken);
                    description.setRankCn(rankcn);
                    descriptionRepository.save(description);
                }
            }


            //   多媒体信息
            JSONArray multmediaList = json.getJSONArray("multmediaList");
            if (!CollectionUtils.isEmpty(multmediaList)){
                for (Object o : multmediaList) {
                    Multimedia multimedia = JSON.parseObject(o.toString(), Multimedia.class);
                    multimedia.setSciname(sciname);
                    multimedia.setChname(chname);
                    multimedia.setAuthorship(authorship);
                    multimedia.setRankEn(ranken);
                    multimedia.setRankCn(rankcn);
                    if (!StringUtils.isEmpty(multimedia.getShowtype())){
                        multimedia.setShowtype("0");
                        if ("macaulaylibrary".equals(multimedia.getSourcesId())){
                            multimedia.setShowtype("1");
                        }
                    }
                    multimediaRepository.save(multimedia);
                }
            }


            //   文献信息
            JSONArray refsList = json.getJSONArray("refsList");
            if (!CollectionUtils.isEmpty(refsList)){
                for (Object o : refsList) {
                    Refs refs = JSON.parseObject(o.toString(), Refs.class);
                    refsRepository.save(refs);
                }
            }


            return BaseResultsUtil.success();
        } catch (Exception e) {
            e.printStackTrace();
            return BaseResultsUtil.error(BaseResultsEnum.UNKNOWN_ERROR.getCode(), e.toString());
        }
    }
}
