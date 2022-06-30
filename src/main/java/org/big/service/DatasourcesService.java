package org.big.service;

import org.big.common.result.BaseResults;

import javax.servlet.http.HttpServletRequest;

/**
 *<p><b> Datasources 的Service类</b></p>
 *<p> Datasources 的Service类，与 Datasources 有关的业务逻辑方法</p>
 * @author Bin
 *<p>Created date: 2018/06/24 10:22</p>
 *<p>Copyright: The Research Group of Biodiversity Informatics (BiodInfo Group) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
public interface DatasourcesService {
    /**
     *<p><b> 数据源列表查询(API) </b></p>
     *<p> 数据源列表查询(API) </p>
     * @author BIN
     * @version: 0.1
     * @Date 2022/06/29
     * @return
     */
    BaseResults findListByName(HttpServletRequest request);
}
