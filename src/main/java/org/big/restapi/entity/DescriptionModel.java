package org.big.restapi.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
/**
 *<p><b>Description相关API</b></p>
 *<p> Description相关API</p>
 * @author Bin
 * <p>Created date: 2022/06/24</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@Getter
@Setter
@ToString
public class DescriptionModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "唯一标识UUID")
	private String id;
	
	@ApiModelProperty(value = "病虫草害拉丁名")
	private String sciname;	
	
	@ApiModelProperty(value = "病虫草害中文名")
	private String cnname;	
	
	@ApiModelProperty(value = "病虫草害英文名")
	private String enname;
	
	@ApiModelProperty(value = "病虫草害简介")
	private String introduce;
	
	@ApiModelProperty(value = "作物名称")
	private String cropName;

	@ApiModelProperty(value = "病虫害分类一级：病害、虫害、草害")
	private String type;

	@ApiModelProperty(value = "病虫害分类二级：黑节病、白粉病、条锈病、秆锈病、叶锈病......")
	private String assort;
	
	@ApiModelProperty(value = "状态（默认1、可用；0、不可用）")
	private Integer status;
	
	@ApiModelProperty(value = "录入时间")
	private Date inputtime;
	
	@ApiModelProperty(value = "最后同步日期")
	private Date synchdate;
	
	@ApiModelProperty(value = "备注")
	private String remark;

	@ApiModelProperty(value = "录入人，关联用户表ID")
	private String userId;

	@ApiModelProperty(value = "作物类别")
	private String crop;
	
	public DescriptionModel() {
		
	}
}