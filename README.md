# 安卓购物商城后台
### 版本 v1.2

### 项目背景

本项目是一个安卓开发课程期末大作业service端项目

作为一个作业性质项目,其本身有许多不完善之处,也有很多功能未实现,考虑到大部分学校对此类作业没有项目完整性要求,因此本着开源精神,将源码放出,给有类似开发需求的同学做一个参考
基于以上背景,本文档内容主要面向初学者,如有错误恳请路过大佬不吝指教

### 项目介绍

安卓购物商城后台项目是一个安卓开发课程期末大作业s端项目,是购物商城app后台程序,为app提供需要的数据

项目使用springboot搭建,数据库使用mysql,持久层使用mybatis-plus

前台app项目传送门：https://github.com/Ervinse/ShoppingMallApplication.git


### 功能说明
- 提供用户登录,注册功能
- 提供获取商品信息功能
- 提供购物车增删改查功能

### 技术栈
项目使用到以下框架
- springboot 2.7.5
- mybatis-plus 3.5.2
- lombok 1.18.24
- slf4j 1.7.36
- mysql 8.0.29


### 开发前配置
- 需要jdk8环境,如果非jdk8,则打开pom.xml文件,将第17行`<java.version>1.8</java.version>`中数字8修改为您对应的jdk版本号,并修改IDE对应的编译配置,例如(以idea为例):
  - 设置 -> 编译,执行,部署 -> java编译器 -> 按模块字节码版本 -> 目标字节码版本
  - 项目结构 -> 项目 -> 语言级别
  - 项目结构 -> 模块 -> 语言级别

- 需要添加mysql数据库,数据库文件位置为:`src/main/resources/shopping_mail_application.sql`,默认创建名为`shopping_mail_application`的数据库,并在此数据库中运行sql文件

- 在application.yml文件中修改`username`,`password`,`url`为您的数据库用户,密码,url

- **默认端口为8088**,如果出现端口占用情况例如`Web server failed to start. Port 8088 was already in use.`,则需要更改端口号,方法为在application.yml中第二行`port: 8088`将数字修改为您想要的端口号

注意:
- 若出现`java:-source1.5中不支持lambda表达式`等编译错误信息,则需要检查IDE对应的编译配置
-  您的数据库需要**8.0及以上的的数据库版本**,并且**url需要符合符合8.0规范**
-  如果您的数据库为本地数据库,端口号为默认的3306,且数据库名使用我提供的默认名`shopping_mail_application`,则无需修改url



### 程序说明

- 实体类共计两个
  - user类为用户登录功能使用
  - goods类中同时含有商品展示功能的属性和购物车功能的属性,在两个controller中都可以使用

- Controller类共计三个
  - CartController实现购物车功能
  - GoodsController实现商品展示功能
  - UserController实现用户登录注册功能 

- 数据库cart表中isSelected字段为存储用户当前是否勾选该商品

### 版本控制
该项目使用Git进行版本管理。您可以在repository参看当前可用版本

### 参与贡献
@南风
