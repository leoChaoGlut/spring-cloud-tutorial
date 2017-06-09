package personal.leo.tutorial.stream.consumer0.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/9 10:29
 * @Description:
 */
public interface LogSubscribeChannel {
    String SUBSCRIBE = "subscribe";

    @Input(SUBSCRIBE)
    SubscribableChannel subscribe();
}
