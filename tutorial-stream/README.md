# spring-cloud-stream-tutorial
# 启动步骤
- [安装kafka](http://kafka.apache.org/quickstart)
- 启动 personal.leo.tutorial.stream.consumer0.Consumer0App
- 启动 personal.leo.tutorial.stream.producer0.Producer0App
# 调试步骤
- 调用接口producer0的接口: 浏览器访问 http://localhost:10001/publish
- 查看consumer0的控制台输出,正常情况下,可以看到producer0发来的消息.
