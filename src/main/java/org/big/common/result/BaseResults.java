package org.big.common.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p><b>BaseResults 类</b></p>
 * <p>BaseResults 类</p>
 * @author Bin
 * <p>Created date: 2022/06/24 10:26</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@ApiModel(description= "返回响应数据")
@Getter
@Setter
@ToString
public class BaseResults<T> implements Serializable {

    @ApiModelProperty(value = "状态码")
    private Integer code;
    @ApiModelProperty(value = "状态信息")
    private String message;
    @ApiModelProperty(value = "返回对象")
    private T data;
 
    public BaseResults() {
        super();
    }
 
    public BaseResults(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

}