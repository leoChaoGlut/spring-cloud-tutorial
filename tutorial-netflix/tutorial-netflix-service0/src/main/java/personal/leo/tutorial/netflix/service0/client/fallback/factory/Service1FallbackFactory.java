package personal.leo.tutorial.netflix.service0.client.fallback.factory;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import personal.leo.tutorial.netflix.service0.client.Service1Client;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/2 17:41
 * @Description:
 */
@Component
public class Service1FallbackFactory implements FallbackFactory<Service1Client> {
    @Override
    public Service1Client create(Throwable throwable) {
        final String msg = "Service1FallbackFactory:" + throwable.getMessage();
        System.out.println(msg);
        return new Service1Client() {
            @Override
            public String tips(int timeout) throws InterruptedException {
                return msg;
            }
        };
    }
}
