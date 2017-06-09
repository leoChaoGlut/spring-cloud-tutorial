package personal.leo.tutorial.stream.producer0.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.leo.tutorial.stream.common.entity.dto.LogInfoDTO;
import personal.leo.tutorial.stream.producer0.channel.LogPublishChannel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/9 10:34
 * @Description:
 */
@RestController
public class Producer0Controller {

    public static final DateTimeFormatter DATE_TIME_PATTERN = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
    @Autowired
    LogPublishChannel logChannel;

    @GetMapping("publish")
    public void publish() {
        LogInfoDTO logInfo = new LogInfoDTO()
                .setTimestamp(Calendar.getInstance().getTimeInMillis())
                .setMsg(LocalDateTime.now().format(DATE_TIME_PATTERN));
        Message<LogInfoDTO> msg = MessageBuilder.withPayload(logInfo).build();
        logChannel.publish().send(msg);
    }

}
