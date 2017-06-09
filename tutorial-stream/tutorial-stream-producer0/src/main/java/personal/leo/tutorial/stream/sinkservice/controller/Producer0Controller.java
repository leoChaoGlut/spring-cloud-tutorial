package personal.leo.tutorial.stream.sinkservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.leo.tutorial.stream.sinkservice.channel.LogChannel;

import javax.annotation.PostConstruct;
import java.util.Calendar;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/9 10:34
 * @Description:
 */
@RestController
public class Producer0Controller {
    @PostConstruct
    private void postConstruct() {
        System.err.println("=================================");
    }

    @Autowired
    LogChannel logChannel;

    @GetMapping("publish")
    public void publish() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        Message<Long> msg = MessageBuilder.withPayload(timeInMillis).build();
        logChannel.publish().send(msg);
    }
}
