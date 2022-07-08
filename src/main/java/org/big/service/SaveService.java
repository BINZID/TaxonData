package org.big.service;

import org.big.common.result.BaseResults;

/**
 * <p><b>SaveService</b></p>
 * <p> </p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfo Group) - 中国科学院动物研究所生物多样性信息学研究组</p>
 *
 * @Author NY
 * @Date: 2022/7/4 10:27
 * @Version V1.0
 * @since JDK 1.8.0_162
 */
public interface SaveService {

    /**
     * <p><b>存储公共表、性状表数据<b><p>
     * <p><p>
     * @Author: Ny
     * @date  2022/7/4
     */
    BaseResults saveData(String data);
}
