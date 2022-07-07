package org.big.restapi;

import io.swagger.annotations.*;
import org.big.common.result.BaseResults;
import org.big.restapi.entity.MultimediaModel;
import org.big.service.MultimediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p><b>Multimedia 相关API方法</b></p>
 * <p>Multimedia 相关API方法</p>
 * @author Bin
 * <p>Created date: 2022/06/24 10:26</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@RestController
@RequestMapping("/app/v1/multimedia")
@Api(tags = "多媒体API列表", produces = "application/json, application/xml")
public class MultimediaRestController {
    @Autowired
    private MultimediaService multimediaService;
    /**
     *<p><b> 根据关联物种Id查询相关多媒体(API) </b></p>
     *<p> 根据关联物种Id查询相关多媒体(API) </p>
     * @author BIN
     * @version: 0.1
     * @Date 2022/06/29
     * @return
     */
    @SuppressWarnings("rawtypes")
    @ApiOperation(value = "根据关联物种Id查询相关多媒体", notes = "部分值必填")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "apiKey", value = "api令牌", dataType = "String", required=true, paramType = "query"),
            /*@ApiImplicitParam(name = "num", value = "每页数量", dataType = "String", required=true, paramType = "query", example = "10"),
            @ApiImplicitParam(name = "page", value = "第几页", dataType = "String", required=true, paramType = "query", example = "1"),*/
            @ApiImplicitParam(name = "mediaType", value = "媒体类型", dataType = "String", required=false, paramType = "query"),
            @ApiImplicitParam(name = "taxonId", value = "关联物种Id", dataType = "String", required=false, paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "OK", response = MultimediaModel.class),
    })
    @PostMapping(value="/findMediaListByTaxonId")    public BaseResults findListByTaxonId(HttpServletRequest request) {
        return multimediaService.findMediaListByTaxonId(request);
    }

    /**
     *<p><b> 根据关联物种名称（拉丁名或中文名）查询相关多媒体(API) </b></p>
     *<p> 根据关联物种（拉丁名或中文名）查询相关多媒体(API) </p>
     * @author BIN
     * @version: 0.1
     * @Date 2022/06/29
     * @return
     */
    @SuppressWarnings("rawtypes")
    @ApiOperation(value = "根据关联物种名称查询相关多媒体", notes = "部分值必填")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "apiKey", value = "api令牌", dataType = "String", required=true, paramType = "query"),
            /*@ApiImplicitParam(name = "num", value = "每页数量", dataType = "String", required=true, paramType = "query", example = "10"),
            @ApiImplicitParam(name = "page", value = "第几页", dataType = "String", required=true, paramType = "query", example = "1"),*/
            @ApiImplicitParam(name = "mediaType", value = "媒体类型", dataType = "String", required=false, paramType = "query"),
            @ApiImplicitParam(name = "name", value = "关联物种名称", dataType = "String", required=false, paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "OK", response = MultimediaModel.class),
    })
    @PostMapping(value="/findMediaListByName")    public BaseResults findListByName(HttpServletRequest request) {
        return multimediaService.findMediaListByName(request);
    }

}
