package personal.leo.tutorial.netflix.service0.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import personal.leo.tutorial.netflix.service0.client.config.Service1ClientConfig;
import personal.leo.tutorial.netflix.service0.client.fallback.factory.Service1FallbackFactory;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/2 17:37
 * @Description: 用于调用 service1
 */
@FeignClient(
        name = "service1",
        configuration = Service1ClientConfig.class,
        fallbackFactory = Service1FallbackFactory.class
)
public interface Service1Client {

    @GetMapping("{timeout}")
    public String tips(@PathVariable("timeout") int timeout) throws InterruptedException;

}
