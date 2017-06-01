package personal.leo.tutorial.sleuth.service1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/1 11:15
 * @Description:
 */
@RestController
@RequestMapping("service1")
public class Service1Controller {
    Logger logger = LoggerFactory.getLogger(Service1Controller.class);

    @NewSpan
    @GetMapping("service1")
    public String service1() {
        logger.info("Service1Controller.service1");
        return "service1";
    }

}
