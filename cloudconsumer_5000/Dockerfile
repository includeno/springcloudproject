#指定基础镜像，在其上进行定制 docker pull openjdk:11-jre
FROM openjdk:11-jre

#声明运行时容器提供服务端口，这只是一个声明，在运行时并不会因为这个声明应用就会开启这个端口的服务
EXPOSE 5000

WORKDIR /app
ADD . /app

COPY target/cloudconsumer_5000-1.0-SNAPSHOT.jar /app/cloudconsumer_5000.jar

#指定容器启动程序及参数   <ENTRYPOINT> "<CMD>"
ENTRYPOINT ["java","-jar","/app/cloudconsumer_5000.jar"]

#vscode 终端
#打包 vscode目录为./cloudconsumer_5000
#docker build ./cloudconsumer_5000 -t cloudconsumer_5000
#运行
#docker run -it -p 5000:5000 --name cloudconsumer_5000_container cloudconsumer_5000
#删除镜像
#docker image rm cloudconsumer_5000
#停止容器
#docker stop cloudconsumer_5000_container
#删除容器
#docker rm cloudconsumer_5000_container

#sudo docker exec -it cloudconsumer_5000 /bin/bash