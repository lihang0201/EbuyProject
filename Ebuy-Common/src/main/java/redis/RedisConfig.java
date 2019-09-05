package redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author:lihang
 * @Description:
 * @param:
 * @return:
 */
@Configuration
public class RedisConfig {
    @Value("${spring.redis.host}")
    private String host;
    @Value("${spring.redis.port}")
    private int port;
    @Value("${spring.redis.database}")
    private int database;

    @Bean
    public RedisPool getRedisPool(){
        if (host.equals("disabled")){
            return null;
        }
        RedisPool redisPool = new RedisPool();
        redisPool.init(host,port,database);
        return redisPool;
    }

}
