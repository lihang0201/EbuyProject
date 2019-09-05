package constants;

/**
 * @Author:lihang
 * @Description:用于定义一些常量
 * @param:
 * @return:
 */
public interface BaseApiConstants {
    //响应code
    String HTTP_CODE_NAME = "code";
    //响应msg
    String HTTP_CODE_MSG = "msg";
    //响应data
    String HTTP_CODE_DATA = "data";
    //请求响应成功
    String HTTP_VALUE_200 = "success";
    //系统错误
    String HTTP_VALUE_500 = "failed";
    //响应请求成功的code
    Integer HTTP_CODE_200 = 200;
    //响应请求失败的code
    Integer HTTP_CODE_500 = 500;
}
