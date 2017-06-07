package personal.leo.tutorial.netflix.service0.client.config;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;
import feign.Feign;
import feign.Target;
import feign.hystrix.HystrixFeign;
import feign.hystrix.SetterFactory;
import org.springframework.context.annotation.Bean;
import personal.leo.tutorial.netflix.service0.client.Service1Client;

import java.lang.reflect.Method;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/5 17:48
 * @Description: 不需要加 @Configuration
 */
public class Service1ClientConfig {
    @Bean
    public Feign.Builder feignHystrixBuilder() {
        return HystrixFeign.builder().setterFactory(new SetterFactory() {
            @Override
            public HystrixCommand.Setter create(Target<?> target, Method method) {
                return HystrixCommand.Setter
                        .withGroupKey(HystrixCommandGroupKey.Factory.asKey(Service1Client.class.getSimpleName()))// 控制 Service1Client 下,所有方法的Hystrix Configuration
                        .andCommandPropertiesDefaults(
                                HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(10000) // 超时配置
                        );
            }
        });
    }
}
