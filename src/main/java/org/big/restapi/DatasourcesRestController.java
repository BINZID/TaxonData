package org.big.restapi;

import io.swagger.annotations.*;
import org.big.common.result.BaseResults;
import org.big.restapi.entity.DescriptionModel;
import org.big.service.DatasourcesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * <p><b>Datasources 相关API方法</b></p>
 * <p>Datasources 相关API方法</p>
 * @author Bin
 * <p>Created date: 2022/06/24 10:26</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@RestController
@RequestMapping("/app/v1/datasources")
@Api(tags = "数据源API列表", produces = "application/json, application/xml")
public class DatasourcesRestController {
    @Autowired
    private DatasourcesService datasourcesService;

    /**
     *<p><b> 数据源列表查询(API) </b></p>
     *<p> 数据源列表查询(API) </p>
     * @author BIN
     * @version: 0.1
     * @Date 2022/06/29
     * @return
     */
    @SuppressWarnings("rawtypes")
    @ApiOperation(value = "数据源列表查询", notes = "部分值必填")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "apiKey", value = "api令牌", dataType = "String", required=true, paramType = "query"),
            /*@ApiImplicitParam(name = "num", value = "每页数量", dataType = "String", required=true, paramType = "query", example = "10"),
            @ApiImplicitParam(name = "page", value = "第几页", dataType = "String", required=true, paramType = "query", example = "1"),*/
            @ApiImplicitParam(name = "name", value = "数据源名称", dataType = "String", required=false, paramType = "query"),
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "OK", response = DescriptionModel.class),
    })
    @PostMapping(value="/findListByName")    public BaseResults findListByName(HttpServletRequest request) {
        return datasourcesService.findListByName(request);
    }

}
