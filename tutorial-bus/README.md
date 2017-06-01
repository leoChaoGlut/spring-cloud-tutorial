# spring-cloud-bus-tutorial
# 说明
这里使用kafka作为MQ
# 启动步骤
- [安装kafka](http://kafka.apache.org/quickstart)
- 启动 personal.leo.tutorial.bus.registry.RegistryApp
- 启动 personal.leo.tutorial.bus.configcenter.ConfigCenterApp
- 启动 personal.leo.tutorial.bus.service0.Service0App
# 调试步骤
- 调用接口: 浏览器访问 http://localhost:10001/tips 
- 修改 tutorial-bus-configcenter\src\main\resources\config\service0.yml 的tips的值
- 调用接口: http://localhost:9999/bus/refresh 
- 查看配置是否更新: http://localhost:9999/service0-default.yml  如果发现配置没有更新,则重启config-center,后续会排查为何config-center没有更新配置.
- 调用接口: 浏览器访问 http://localhost:10001/tips  正常情况下,可以看到tips的值改变.
