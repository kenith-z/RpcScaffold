package xyz.hcworld.service.impl;

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.beans.factory.annotation.Value;
import xyz.hcworld.service.DemoService;

/**
 * @ClassName: DemoServiceImpl
 * @Author: 张红尘
 * @Date: 2021-05-24
 * @Version： 1.0
 */

@DubboService(interfaceClass = DemoService.class,interfaceName = "${demo.service.name}",version = "${demo.service.version}")
public class DemoServiceImpl  implements DemoService {

    @Value("${demo.service.name}")
    private String serviceName;

    @Override
    public String sayName(String name) {
        RpcContext rpcContext = RpcContext.getContext();
        return String.format("Service [name :%s , port : %d] %s(\"%s\") : Hello,%s",
                serviceName,
                rpcContext.getLocalPort(),
                rpcContext.getMethodName(),
                name,
                name);
    }
}
