# Nowcoder-Community

本项目是一个基于SpringBoot的社区平台，实现了牛客网讨论区的功能。实现了邮箱注册、验证码登录、发帖、评论、私信、点赞、关注、统计网
站访问次数等功能，数据库使用Mybatis、Redis，使用Kafka构建系统通知，使用Elasticsearch构建全文搜索功能。同时实现生成pdf文件、
上传云服务器等功能.

## 项目总结

* Spring Boot
* **Spring**
* Spring MVC、Spring Mybatis、**Spring Security**
* 权限@会话管理
  * 注册、登录、退出、状态、设置、授权
  * Spring Email、**Interceptor**
* 核心@敏感词、@事务
  * 首页、帖子、评论、私信、异常、日志
  * Advice、**AOP**、**Transaction**
* 性能@数据结构
  * 点赞、关注、统计、缓存
  * **Redis**
* 通知@模式
  * 系统通知
  * Kafka
* 搜索@索引
  * 全文搜索
  * Elasticsearch
* 其他@线程池、@缓存
  * 排行、上传、服务器缓存
  * Quartz、**Caffeine**