package xyz.hcworld.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hcworld.service.DemoService;

/**
 * @ClassName: DubboController
 * @Author: 张红尘
 * @Date: 2021-05-24
 * @Version： 1.0
 */
@RestController
public class DubboController {

    @DubboReference(interfaceClass = DemoService.class,interfaceName = "${demo.service.name}",version = "${demo.service.version}")
    private DemoService demoService;

    @RequestMapping("/hello")
    public String sayHello(){
        return demoService.sayName("张");
    }

}
