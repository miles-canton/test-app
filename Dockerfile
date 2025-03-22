# 使用一个官方的 Java 运行时环境作为基础镜像
FROM openjdk:17-jdk-slim

# 设置工作目录
WORKDIR /app

# 将构建的 jar 文件复制到容器中
COPY target/test-app-*-SNAPSHOT.jar /app/test-app.jar

# 设置容器启动时执行的命令
ENTRYPOINT ["java", "-jar", "/app/test-app.jar"]

# 公开容器的端口
EXPOSE 8080

