# spring-cloud-netflix-tutorial
- 整合 Hystrix,Ribbon,Feign
# 说明
- 目前这三种组件的讲解资料较少,包括官方的wiki也只是将配置项列出,没有告知如何整合Spring Cloud来做细粒度更小的控制.该工程会提供一些实例,并告知阅读哪些源码来解决问题.
- service1 仅用于被 service0 调用.
- 使用三种组件,解决分布式服务调用的常见问题
  - 超时
  - 熔断
  - 失败回调
# 启动步骤
- 启动 personal.leo.tutorial.netflix.registry.RegistryApp
- 启动 personal.leo.tutorial.netflix.service0.Service0App
- 启动 personal.leo.tutorial.netflix.service1.Service1App (启动2个实例,分别在不同的端口)
# 调试步骤
- 请参看 personal.leo.tutorial.netflix.service0.controller.Service0Controller 所提供的rest接口,内有解释.
