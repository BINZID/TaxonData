package org.big.service.impl;

import org.big.common.result.BaseResults;
import org.big.repository.DescriptiontypeRepository;
import org.big.service.DescriptiontypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 *<p><b> Descriptiontype 的Service类</b></p>
 *<p> Descriptiontype 的Service类，与 Descriptiontype 有关的业务逻辑方法</p>
 * @author Bin
 *<p>Created date: 2022/06/24 10:22</p>
 *<p>Copyright: The Research Group of Biodiversity Informatics (BiodInfo Group) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@Service
public class DescriptiontypeServiceImpl implements DescriptiontypeService {
    @Autowired
    private DescriptiontypeRepository descriptiontypeRepository;

    @Override
    public BaseResults findListByName(HttpServletRequest request) {
        return null;
    }
}
