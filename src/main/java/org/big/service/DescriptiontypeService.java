package org.big.service;

import org.big.common.result.BaseResults;

import javax.servlet.http.HttpServletRequest;

public interface DescriptiontypeService {
    /**
     *<p><b> 描述类型列表查询(API) </b></p>
     *<p> 描述类型列表查询(API) </p>
     * @author BIN
     * @version: 0.1
     * @Date 2022/06/29
     * @return
     */
    BaseResults findListByName(HttpServletRequest request);
}
