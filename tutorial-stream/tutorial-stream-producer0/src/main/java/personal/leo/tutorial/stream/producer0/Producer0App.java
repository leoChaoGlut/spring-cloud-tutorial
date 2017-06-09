package personal.leo.tutorial.stream.producer0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import personal.leo.tutorial.stream.producer0.channel.LogPublishChannel;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/8 18:24
 * @Description:
 */
@EnableBinding({
        LogPublishChannel.class
})
@SpringBootApplication
public class Producer0App {
    public static void main(String[] args) {
        SpringApplication.run(Producer0App.class, args);
    }
}
