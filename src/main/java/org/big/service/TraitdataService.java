package org.big.service;

import org.big.common.result.BaseResults;

import javax.servlet.http.HttpServletRequest;

public interface TraitdataService {
    /**
     *<p><b> 根据关联物种名称（拉丁名或中文名）查询相关性状数据(API) </b></p>
     *<p> 根据关联物种（拉丁名或中文名）查询相关性状数据(API) </p>
     * @author BIN
     * @version: 0.1
     * @Date 2022/06/29
     * @return
     */
    BaseResults findTraitListByName(HttpServletRequest request);
}
