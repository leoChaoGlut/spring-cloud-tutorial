package personal.leo.tutorial.sleuth.service0.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.leo.tutorial.sleuth.service0.client.Service1Client;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/1 11:15
 * @Description:
 */
@RestController
@RequestMapping("service0")
public class Service0Controller {
    Logger logger = LoggerFactory.getLogger(Service0Controller.class);

    @NewSpan
    @GetMapping("service0")
    public String service0() {
        logger.info("Service0Controller.service0");
        return "service0";
    }

    @Autowired
    Service1Client service1Client;

    @NewSpan
    @GetMapping("service1")
    public String service1() {
        logger.info("Service0Controller.service1");
        String service1 = service1Client.service1();
        return "service0-" + service1;
    }

}
