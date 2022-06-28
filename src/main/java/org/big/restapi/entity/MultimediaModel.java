package org.big.restapi.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 *<p><b> Multimedia 相关API</b></p>
 *<p> Multimedia 相关API</p>
 * @author Bin
 * <p>Created date: 2022/06/24</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@Getter
@Setter
@ToString
public class MultimediaModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "唯一标识UUID")
	private String id;

	@ApiModelProperty(value = "物种拉丁名")
	private String sciname;

	@ApiModelProperty(value = "物种中文名")
	private String chname;

	@ApiModelProperty(value = "分类等级")
	private String rank;

	@ApiModelProperty(value = "标题")
	private String title;

	@ApiModelProperty(value = "展示类型")
	private String showtype;

	@ApiModelProperty(value = "媒体类型")
	private String mediatype;

	@ApiModelProperty(value = "媒体标签")
	private String medialabel;

	@ApiModelProperty(value = "媒体信息")
	private String mediainfo;

	@ApiModelProperty(value = "国家")
	private String country;

	@ApiModelProperty(value = "省")
	private String province;

	@ApiModelProperty(value = "市")
	private String city;

	@ApiModelProperty(value = "县")
	private String county;

	@ApiModelProperty(value = "小地名")
	private String locality;

	@ApiModelProperty(value = "分布信息")
	private String location;

	@ApiModelProperty(value = "经度")
	private Double lng;

	@ApiModelProperty(value = "纬度")
	private Double lat;

	@ApiModelProperty(value = "存储路径")
	private String path;

	@ApiModelProperty(value = "原始路径")
	private String originurl;

	@ApiModelProperty(value = "版权信息")
	private String copyright;

	@ApiModelProperty(value = "权利所有人")
	private String rightsholder;

	@ApiModelProperty(value = "发布人")
	private String announcer;

	@ApiModelProperty(value = "贡献者")
	private String contributor;

	@ApiModelProperty(value = "共享协议")
	private String licenseName;

	@ApiModelProperty(value = "共享协议ID")
	private String licenseId;

	@ApiModelProperty(value = "数据源")
	private String sourcesName;

	@ApiModelProperty(value = "数据源ID")
	private String sourcesId;

	@ApiModelProperty(value = "参考文献")
	private String referencejson;

	@ApiModelProperty(value = "关联描述ID")
	private String descriptionId;

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

	public MultimediaModel() {
		
	}
}