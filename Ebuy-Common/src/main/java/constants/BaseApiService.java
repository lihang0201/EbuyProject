package constants;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:lihang
 * @Description:通用API父类
 * @param:
 * @return:
 */
public class BaseApiService {

    /**
     * 请求成功后返回带信息的结果
     * @param msg
     * @return
     */
    public Map<String,Object> setResultSuccess(String msg){
        return setResult(BaseApiConstants.HTTP_CODE_200,msg,null);
    }

    /**
     * 请求成功后返回成功结果
     * @return
     */
    public Map<String,Object> setResultSuccess(){
        return setResult(BaseApiConstants.HTTP_CODE_200,BaseApiConstants.HTTP_VALUE_200,null);
    }

    /**
     * 请求成功后返回带数据的结果
     * @param data
     * @return
     */
    public Map<String,Object> setResultSuccess(Object data){
        return setResult(BaseApiConstants.HTTP_CODE_200,BaseApiConstants.HTTP_VALUE_200,data);
    }

    /**
     * 出现错误返回500并返回错误信息
     * @param msg
     * @return
     */
    public Map<String,Object> setResultError(String msg){
        return setResult(BaseApiConstants.HTTP_CODE_500,msg,null);
    }

    /**
     * 自定义返回状态码，信息，数据
     * @param code
     * @param msg
     * @param data
     * @return
     */
    public Map<String,Object> setResult(Integer code,String msg,Object data){
        Map<String,Object> result = new HashMap<String,Object>();
        result.put(BaseApiConstants.HTTP_CODE_NAME,code);
        result.put(BaseApiConstants.HTTP_CODE_MSG,msg);
        result.put(BaseApiConstants.HTTP_CODE_DATA,data);
        return result;
    }
}
