package log;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @Author:lihang
 * @Description:使用AOP配置日志打印
 * @Aspect：注解用于申明这是一个Spring管理的切面Bean
 */
@Aspect
@Component
@Slf4j
public class AopLogConfig {
}
