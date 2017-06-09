package personal.leo.tutorial.stream.sinkservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import personal.leo.tutorial.stream.sinkservice.channel.LogChannel;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/8 18:24
 * @Description:
 */
@EnableBinding({
        LogChannel.class
})
@EnableWebMvc
@SpringBootApplication
public class Producer0App {
    public static void main(String[] args) {
        SpringApplication.run(Producer0App.class, args);
    }
}
