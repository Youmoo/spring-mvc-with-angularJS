### spring mvc with angularJS
演示spring mvc 与 angularJS 搭配使用。

```bash
git clone https://github.com/Youmoo/spring-mvc-with-angularJS
cd spring-mvc-with-angularJS//spring-angular
mvn clean install jetty:run
```
Open your browser and goto http://localhost:8080/user/list.do

### 注意代码的分层
- java部分
    - dao:获取数据库数据
    - service:调用dao组织页面数据
    - vo:封装页面数据
    - converter:domain到vo的转换器
    - command:处理ajax请求
    - controller:主要用来返回静态页面
- angular部分
    - app:每个app对应一个command
    - service:每个service对应command里的一个group
    - controller:逻辑上为一个完整的块即可

### 如果您是开发单页应用
单页应用的angular分层，可以参考：https://github.com/angular/angular-seed
