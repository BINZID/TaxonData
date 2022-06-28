package org.big.repository;

import org.big.entity.Datasources;
import org.big.repository.base.BaseRepository;
import org.springframework.stereotype.Repository;

/**
 *<p><b> Datasources 的DAO类接口</b></p>
 *<p> Datasources 的DAO类接口，与 Datasources 有关的持久化操作方法</p>
 * @author Bin
 *<p>Created date: 2022/06/24 10:20</p>
 *<p>Copyright: The Research Group of Biodiversity Informatics (BiodInfo Group) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@Repository
public interface DatasourcesRepository extends BaseRepository<Datasources, String> {
    
}
