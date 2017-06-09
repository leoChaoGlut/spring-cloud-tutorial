package personal.leo.tutorial.stream.common.entity.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/9 11:50
 * @Description:
 */
@Getter
@Setter
@ToString
public class LogInfoDTO {
    private long timestamp;
    private String msg;
}
