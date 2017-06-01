# spring-cloud-config-tutorial
# 启动步骤

- 启动 personal.leo.tutorial.config.registry.RegistryApp
- 启动 personal.leo.tutorial.config.configcenter.ConfigCenterApp

# 调试步骤
- 启动 personal.leo.tutorial.config.service0.Service0App,如果没有报错,并且能在控制台看到" Fetching config from server at: http://localhost:9999/" 代表已经成功从注册中心中找到配置中心,并开始获取配置
- 浏览器访问: "http://localhost:9999/service0-default.yml" 正确输入用户名和密码后,可以看到service0.yml的配置. 用户名和密码,可以在"tutorial-config-configcenter\src\main\resources\bootstrap.yml"中找到

