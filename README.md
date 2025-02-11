# RabbitMQ Demo Project

## 项目介绍
这是一个基于 Spring Boot 和 RabbitMQ 的消息队列演示项目，包含生产者和消费者两个模块。

## 技术栈
- Java 17
- Spring Boot 3.2.2
- RabbitMQ
- Maven

## 项目结构
- `producer/`: 消息生产者模块
- `consumer/`: 消息消费者模块
- `rabbitmq/`: RabbitMQ 配置文件

## 环境准备
1. 安装 Java 17
2. 安装 Maven
3. 安装 Docker 和 Docker Compose

## 运行步骤
1. 克隆项目
2. 进入项目根目录
3. 执行 `docker-compose up -d` 启动 RabbitMQ
4. 分别启动 producer 和 consumer 模块

## 配置说明
- RabbitMQ 默认用户: admin
- RabbitMQ 默认密码: admin
- RabbitMQ 管理界面: http://localhost:15672

## 注意事项
- 请妥善保管 RabbitMQ 凭证
- 生产环境请更改默认密码