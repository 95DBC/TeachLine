# TeachLine
这是一个基于SSM框架的在线教育网站

详细教程可查看项目目录下的 doc中的idea 开发使用教程



项目环境说明：（版本应当不低于以下版本）
开发平台：Windows10 


jdk版本：1.8


IntelliJ IDEA 版本：2.5


Tomcat版本:8.0


Maven 版本：3.5


## 1.   执行SQL文件，添加数据
具体软件操作可以参考以下百度经验
[IntelliJ IDEA 如何连接MySQL](https://jingyan.baidu.com/article/2d5afd6923328b85a2e28e0b.html)

[IntellliJ IDEA IntelliJ 如何创建数据表和SQL文件](https://jingyan.baidu.com/article/bea41d43a80be4b4c51be60c.html)

## 2.   导入项目
![项目导入](/demo_inxedu_open/img/1.png)

## 3.   配置maven，选择jdk运行环境
[windows10如何安装Maven](https://jingyan.baidu.com/article/046a7b3e80bc06f9c27fa9bb.html)
选择Maven 文件
![选择Maven](/demo_inxedu_open/img/2.png)
jdk 配置

![jdk 配置](/demo_inxedu_open/img/3.png)
## 4.	配置项目
 属性文件路径：\src\main\resources\project.properties
注：只需配置和修改sql主机地址，数据库名，用户名，密码， 项目访问路径，这几个属性，项目即可正常运行访问。
```
#数据库连接配置
#数据库主机地址
jdbc.host=127.0.0.1
#数据库名
jdbc.database=demo_inxedu_v2_0_open
#数据库用户名
jdbc.username=
#数据库密码
jdbc.password=

#项目访问路径
contextPath=http://127.0.0.1:80

#邮箱配置
#邮箱信息
email.host=smtp.163.com
#邮箱号
email.username=
#邮箱密码
email.password=

#项目名
projectName=inxedu
#Cookie域
mydomain=
#授权账户
authorizationAccount=inxedu
#授权key
authorizationKey=edc3d9c3765ac000f05e2ced93756603
```
修改启动端口Maven pom.xml   port
```
<!-- tomcat plugin -->
<plugin>
    <groupId>org.apache.tomcat.maven</groupId>
    <artifactId>tomcat7-maven-plugin</artifactId>
    <version>2.2</version>
    <configuration>
        <path>/</path>
        <port>80</port>
        <uriEncoding>UTF-8</uriEncoding>
        <url>http://127.0.0.1/manager</url>
        <server>tomcat7</server>
        <contextReloadable>true</contextReloadable>
        <warSourceDirectory>src/main/webapp</warSourceDirectory>
        <contextReloadable>false</contextReloadable>
    </configuration>
</plugin>

```
## 5.	编译项目
Clean》
![Clean](/demo_inxedu_open/img/4.png)
Install》
![Install](/demo_inxedu_open/img/5.png)

## 6.	项目运行
6.1  单击Run-->Edit Configurations...-->
![添加maven](/demo_inxedu_open/img/6.png)
![Maven项目运行](/demo_inxedu_open/img/7.png)

## 7.	项目访问
>前台http://127.0.0.1/ 
测试账号：15626614886@qq.com 111111


后台 http://127.0.0.1/admin 
测试账号：admin 111111

## 8.效果预览图
![效果预览](/demo_inxedu_open/gif/show.gif)
