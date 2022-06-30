package org.big.service;

import org.big.common.result.BaseResults;

import javax.servlet.http.HttpServletRequest;

public interface MultimediaService {
    /**
     *<p><b> 根据关联物种Id查询相关多媒体 </b></p>
     *<p> 根据关联物种Id查询相关多媒体 </p>
     * @author BIN
     * @version: 0.1
     * @Date 2022/06/29
     * @return
     */
    BaseResults findListByTaxonId(HttpServletRequest request);

    /**
     *<p><b> 根据关联物种名称（拉丁名或中文名）查询相关多媒体 </b></p>
     *<p> 根据关联物种（拉丁名或中文名）查询相关多媒体 </p>
     * @author BIN
     * @version: 0.1
     * @Date 2022/06/29
     * @return
     */
    BaseResults findListByName(HttpServletRequest request);
}
