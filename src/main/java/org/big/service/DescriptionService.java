package org.big.service;

import org.big.common.result.BaseResults;

import javax.servlet.http.HttpServletRequest;

public interface DescriptionService {
    /**
     * <p><b>带分页排序的条件查询</b></p>
     * <p> 带分页排序的条件查询</p>
     * @author Bin
     * @param request
     * @return
     */

    BaseResults findListByTaxonId(HttpServletRequest request);

    BaseResults findListByName(HttpServletRequest request);
}
