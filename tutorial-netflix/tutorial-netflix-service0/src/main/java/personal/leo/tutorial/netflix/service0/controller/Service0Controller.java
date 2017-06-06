package personal.leo.tutorial.netflix.service0.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import personal.leo.tutorial.netflix.service0.client.Service1Client;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/2 15:08
 * @Description:
 */
@RestController
public class Service0Controller {

    @Autowired
    Service1Client service1Client;

    /**
     * 该接口用于测试 Hystrix 和 Ribbon ,以及各自的超时之间的关系
     * 根据Spring Cloud 官方描述,HyStrix的超时应该稍长于Ribbon的总超时(连接超时,读超时,retry次数)
     *
     * @param timeout
     * @return
     * @throws InterruptedException
     */
    @GetMapping("call/service1/{timeout}")
    public String callService1(@PathVariable int timeout) throws InterruptedException {
        System.out.println("<<<<< Service0Controller.callService1 <<<<<");
        String tips = service1Client.tips(timeout);
        return tips;
    }

    /**
     * 仅测试Hystrix
     *
     * @param timeout
     * @return
     * @throws InterruptedException
     */
    @HystrixCommand(
            commandKey = "Service0Controller-tips",
            fallbackMethod = "tipsFallback"
    )
    @GetMapping("tips/{timeout}")
    public String tips(@PathVariable int timeout) throws InterruptedException {
        System.out.println("<<<<< Service0Controller.tips <<<<<");
        TimeUnit.SECONDS.sleep(timeout);
        return "Service0Controller.tips";
    }

    public String tipsFallback(int timeout) {
        return "tipsFallback";
    }

}
