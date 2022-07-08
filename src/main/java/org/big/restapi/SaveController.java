package org.big.restapi;

import com.alibaba.fastjson.JSON;
import org.big.common.result.BaseResults;
import org.big.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p><b>SaveController</b></p>
 * <p> </p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfo Group) - 中国科学院动物研究所生物多样性信息学研究组</p>
 *
 * @Author NY
 * @Date: 2022/7/4 10:12
 * @Version V1.0
 * @since JDK 1.8.0_162
 */
@RestController
@RequestMapping("/save")
public class SaveController {

    @Autowired
    private SaveService saveService;

    @PostMapping("/data")
    public String saveData(@RequestParam("data") String data){
        BaseResults baseResults = saveService.saveData(data);
        return JSON.toJSONString(baseResults);
    }


}
