package org.big.common.result;

/**
 * <p><b>BaseResult工具类</b></p>
 * <p>BaseResult工具类</p>
 *
 * @author Bin
 * <p>Created date: 2022/06/24 10:26</p>
 * <p>Copyright: The Research Group of Biodiversity Informatics (BiodInfoGroup) - 中国科学院动物研究所生物多样性信息学研究组</p>
 * @version: 0.1
 * @since JDK 1.80_144
 */
public class BaseResultsUtil {
	 
    /**成功且带数据**/
	public static BaseResults success(Object object){
        BaseResults BaseResult = new BaseResults();
        BaseResult.setCode(BaseResultsEnum.SUCCESS.getCode());
        BaseResult.setMessage(BaseResultsEnum.SUCCESS.getMessage());
        BaseResult.setData(object);
        return BaseResult;
    }
    /**成功但不带数据**/
    public static BaseResults success(){
        String[] zero = new String[0];
        return success(zero);
    }
    /**失败**/
	public static BaseResults error(Integer code,String msg){
        BaseResults BaseResult = new BaseResults();
        String[] zero = new String[0];
        BaseResult.setCode(code);
        BaseResult.setMessage(msg);
        BaseResult.setData(zero);
        return BaseResult;
    }
	
}