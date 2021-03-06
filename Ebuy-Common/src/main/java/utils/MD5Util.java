package utils;

import org.apache.logging.log4j.util.PropertiesUtil;

import java.security.MessageDigest;

/**
 * @Author:lihang
 * @Description:
 * @param:
 * @return:
 */
public class MD5Util {

    private static final char hexDigits[] =
            {'0', '1', '2', '3','4','5','6','7','8','9','A','B','C','D','E','F'};
    public final static String MD5(String s){
        try {
            byte[] btInput = s.getBytes();
            //获得MD5摘要算法的MessageDigest对象
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            //使用指定的字节更新摘要
            mdInst.update(btInput);
            //获得密文
            byte[] md = mdInst.digest();
            //将密文转换为十六进制的字符串形式
            int j = md.length;
            char str[] = new  char[j * 2];
            int k = 0;
            for (int i = 0;i < j;i++){
                byte byte0 = md[i];
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
