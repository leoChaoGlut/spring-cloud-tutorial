# spring-cloud-sleuth-tutorial
# 启动步骤
- [安装zipkin](http://zipkin.io/pages/quickstart.html)
- 启动 personal.leo.tutorial.sleuth.registry.RegistryApp
- 启动 personal.leo.tutorial.sleuth.service0.Service0App
- 启动 personal.leo.tutorial.sleuth.service1.Service1App
# 调试步骤
- 调用接口: 浏览器访问 http://localhost:10001/service0/service1 
- 查看trace: 浏览器访问 http://localhost:9411/ 
