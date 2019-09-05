package redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Author:lihang
 * @Description:
 * @param:
 * @return:
 */
@Component
public class RedisUtils {

    @Autowired
    private StringRedisTemplate redisTemplate;

    public void set(String key,Object value,Long timeout){
        if (value != null){
            if (value instanceof String){
                String setValue = (String) value;
                redisTemplate.opsForValue().set(key, setValue);
            }
            if (timeout != null){
                redisTemplate.expire(key,timeout, TimeUnit.SECONDS);
            }
        }
    }

    /**
     * 添加redis信息（有过期时间）
     * @param key
     * @param value
     * @param timeout
     */
    public void setString(String key,String value,Long timeout){
        set(key,value,timeout);
    }

    /**
     * 添加redis信息（无过期时间）
     * @param key
     * @param value
     */
    public void setString(String key,String value){
        set(key,value,null);
    }

    /**
     * 使用key查找redis中的信息
     * @param key
     * @return
     */
    public String get(String key){
        return redisTemplate.opsForValue().get(key);
    }

    /**
     * 使用key删除redis中的数据
     * @param key
     */
    public void delete(String key){
        redisTemplate.delete(key);
    }
}
