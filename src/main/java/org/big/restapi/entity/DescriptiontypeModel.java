package org.big.restapi.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 *<p><b> Descriptiontype 相关API</b></p>
 *<p> Descriptiontype 相关API</p>
 * @author Bin
 * <p>Created date: 2022/06/24</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@Getter
@Setter
@ToString
public class DescriptiontypeModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "唯一标识UUID")
	private String id;

	@ApiModelProperty(value = "描述类型")
	private String descterm;

	public DescriptiontypeModel() {
		
	}
}