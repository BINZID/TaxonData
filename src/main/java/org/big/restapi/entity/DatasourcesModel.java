package org.big.restapi.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *<p><b> Datasources 相关API</b></p>
 *<p> Datasources 相关API</p>
 * @author Bin
 * <p>Created date: 2022/06/24</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@Getter
@Setter
@ToString
public class DatasourcesModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "唯一标识UUID")
	private String id;

	@ApiModelProperty(value = "数据源名称")
	private String dsname;

	@ApiModelProperty(value = "数据源类型")
	private String dstype;

	@ApiModelProperty(value = "数据源版本")
	private String version;

	@ApiModelProperty(value = "版权信息")
	private String copyright;

	@ApiModelProperty(value = "权利所有人")
	private String rightsholder;

	@ApiModelProperty(value = "创建人")
	private String creater;

	@ApiModelProperty(value = "创建时间")
	private String createtime;

	@ApiModelProperty(value = "概述")
	private String dsabstract;

	@ApiModelProperty(value = "关键词")
	private String dskeyword;

	@ApiModelProperty(value = "链接")
	private String dsurl;

	@ApiModelProperty(value = "状态")
	private Integer status;

	@ApiModelProperty(value = "同步日期")
	private Timestamp synchdate;

	@ApiModelProperty(value = "备注")
	private String remark;

	public DatasourcesModel() {
		
	}
}