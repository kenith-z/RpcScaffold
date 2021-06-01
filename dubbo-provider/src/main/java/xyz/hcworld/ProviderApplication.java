package xyz.hcworld;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 *
 * DubboComponentScan dubbo扫描报
 * @ClassName: ProviderApplication
 * @Author: 张红尘
 * @Date: 2021-05-24
 * @Version： 1.0
 */

@SpringBootApplication
@EnableDubbo(scanBasePackages = {"xyz.hcworld.service.impl"})
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
