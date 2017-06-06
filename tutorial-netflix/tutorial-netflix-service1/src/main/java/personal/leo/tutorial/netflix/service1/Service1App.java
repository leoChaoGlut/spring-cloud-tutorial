package personal.leo.tutorial.netflix.service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/2 15:01
 * @Description:
 */
@SpringBootApplication
@EnableEurekaClient
public class Service1App {
    public static void main(String[] args) {
        SpringApplication.run(Service1App.class, args);
    }
}
