package utils;

import java.util.UUID;

/**
 * @Author:lihang
 * @Description:
 * @param:
 * @return:
 */
public class UUIDUtil {
    public static String randomUUID() {
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
}
