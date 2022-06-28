package org.big.restapi;

import io.swagger.annotations.*;
import org.big.restapi.entity.DescriptionModel;
import org.big.service.DescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.List;

/**
 * <p><b>Description 相关API方法</b></p>
 * <p>Description 相关API方法</p>
 * @author Bin
 * <p>Created date: 2022/06/24 10:26</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@RestController
@RequestMapping("/app/v1/description")
@Api(tags = "物种描述API列表", produces = "application/json, application/xml")
public class DescriptionRestController {
    @Autowired
    private DescriptionService descriptionService;

    /**
     *<p><b>物种描述列表(API)</b></p>
     *<p>物种描述列表(API)</p>
     * @author BIN
     * @version: 0.1
     * @Date 2020/08/04
     * @return
     */
    @SuppressWarnings("rawtypes")
    @ApiOperation(value = "物种描述列表", notes = "部分值必填")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "apiKey", value = "api令牌", dataType = "String", required=true, paramType = "query"),
            @ApiImplicitParam(name = "num", value = "每页数量", dataType = "String", required=true, paramType = "query", example = "10"),
            @ApiImplicitParam(name = "page", value = "第几页", dataType = "String", required=true, paramType = "query", example = "1"),
            @ApiImplicitParam(name = "type", value = "描述类型", dataType = "String", required=false, paramType = "query"),
            @ApiImplicitParam(name = "search", value = "物种描述检索", dataType = "String", required=false, paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "OK", response = DescriptionModel.class),
    })
    @GetMapping(value="/list")    public List<String> list(HttpServletRequest request) {

        // return descriptionService.findListByInfo(request);
        return Collections.singletonList("Xxx");
    }

}
