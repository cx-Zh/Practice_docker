# 使用JDK8环境作为基础镜像
FROM java:8

# 拷贝JRA包
ADD build/libs/C-docker-and-docker-compose-basics-homework-0.0.1-SNAPSHOT.jar app.jar

# 容器启动时执行
ENTRYPOINT ["java","-jar","/app.jar"]

# 暴露端口
EXPOSE 8080