package org.big.common.result;

import lombok.Getter;

/**
 * <p><b>BaseResult枚举类</b></p>
 * <p> BaseResult枚举类</p>
 * @author Bin
 * <p>Created date: 2022/06/24 10:26</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
@Getter
public enum BaseResultsEnum {

	SUCCESS(200, "OK"),
	Save_success(201, "保存成功"),
	BAD_REQUEST(400, "错误请求"),
	Api_error(401, "令牌错误"),
	FORBID_REQUEST(403, "禁止请求"),
	NOT_FOUND(404, "NOT FOUND"),
	Request_Too_Large(413, "请求的实体过大"),
	SERVER_EXCEPTION(500, "服务器异常"),
	NULL_POINT(1001, "空指针异常"),
	INDEX_OUT(1002, "索引越界"),
	UNKNOWN_ERROR(1003, "error（未知错误，包括页数错误、每页数量错误、网络连接超时等错误）"),
	NO_RESULT(1004, "查询结果为空！");

    private Integer code;
    private String message;
 
    BaseResultsEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
 
}