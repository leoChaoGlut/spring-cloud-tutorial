package personal.leo.tutorial.stream.consumer0.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/9 10:29
 * @Description: 实际上是不需要加@Component的,但是如果不加,在@AutoWire LogChannel的时候,Idea会提示没有这个bean,所以加上. 强迫症,哈哈
 */
@Component
public interface LogSubscribeChannel {
    String SUBSCRIBE = "subscribe";

    @Input(SUBSCRIBE)
    SubscribableChannel subscribe();
}
