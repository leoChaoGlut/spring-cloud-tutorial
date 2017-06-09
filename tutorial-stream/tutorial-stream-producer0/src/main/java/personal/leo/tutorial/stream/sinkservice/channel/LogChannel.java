package personal.leo.tutorial.stream.sinkservice.channel;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/9 10:29
 * @Description:
 */
public interface LogChannel {
    @Output
    MessageChannel publish();
}
