package personal.leo.tutorial.stream.consumer0.channel.handler;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;
import personal.leo.tutorial.stream.common.entity.dto.LogInfoDTO;
import personal.leo.tutorial.stream.consumer0.channel.LogSubscribeChannel;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/9 11:35
 * @Description:
 */
@Component
public class LogSubscribeHandler {
    @StreamListener(LogSubscribeChannel.SUBSCRIBE)
    public void handleSubscribe(LogInfoDTO logInfo) {
        System.out.println(logInfo.toString());
    }
}
