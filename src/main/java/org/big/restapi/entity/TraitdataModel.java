package org.big.restapi.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *<p><b> Traitdata 相关API</b></p>
 *<p> Traitdata 相关API</p>
 * @author Bin
 * <p>Created date: 2022/06/24</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@Getter
@Setter
@ToString
public class TraitdataModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "唯一标识UUID")
	private String id;

	@ApiModelProperty(value = "物种拉丁名")
	private String sciname;

	@ApiModelProperty(value = "物种中文名")
	private String chname;

	@ApiModelProperty(value = "种下拉丁名")
	private String infrasp;

	@ApiModelProperty(value = "种下中文名")
	private String chinfrasp;

	@ApiModelProperty(value = "分类等级")
	private String rank;

	@ApiModelProperty(value = "性状名称")
	private String traitontology;

	@ApiModelProperty(value = "属性")
	private String traitproperty;

	@ApiModelProperty(value = "值")
	private String traitvalue;

	@ApiModelProperty(value = "测量单位")
	private String traitunit;

	@ApiModelProperty(value = "测量依据")
	private String measurement;

	@ApiModelProperty(value = "标本采集地")
	private String locality;

	@ApiModelProperty(value = "标本号")
	private String specimenno;

	@ApiModelProperty(value = "类群")
	private String taxongroups;

	@ApiModelProperty(value = "数据源")
	private String sourcesName;

	@ApiModelProperty(value = "数据源ID")
	private String sourcesId;

	@ApiModelProperty(value = "参考文献")
	private String referencejson;

	@ApiModelProperty(value = "描述类型")
	private String descriptiontypeName;

	@ApiModelProperty(value = "描述类型ID")
	private String descriptiontypeId;

	@ApiModelProperty(value = "关联物种ID")
	private String taxonId;

	@ApiModelProperty(value = "数据库ID")
	private String dbaseId;

	@ApiModelProperty(value = "状态")
	private Integer status;

	@ApiModelProperty(value = "同步日期")
	private Timestamp synchdate;

	@ApiModelProperty(value = "备注")
	private String remark;

	public TraitdataModel() {
		
	}
}