package personal.leo.tutorial.netflix.service1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/2 15:08
 * @Description:
 */
@RestController
public class Service1Controller {

    @GetMapping("{timeout}")
    public String tips(@PathVariable int timeout) throws InterruptedException {
        System.out.println("<<<<< Service1Controller.tips <<<<<");
        TimeUnit.SECONDS.sleep(timeout);
        return "Service1Controller.tips";
    }

}
