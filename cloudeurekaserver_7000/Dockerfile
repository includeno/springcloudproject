#指定基础镜像，在其上进行定制 docker pull openjdk:11-jre
FROM openjdk:11-jre

#声明运行时容器提供服务端口，这只是一个声明，在运行时并不会因为这个声明应用就会开启这个端口的服务
EXPOSE 7000

WORKDIR /app
ADD . /app

COPY target/cloudeurekaserver_7000-1.0-SNAPSHOT.jar /app/cloudeurekaserver_7000.jar

#指定容器启动程序及参数   <ENTRYPOINT> "<CMD>"
ENTRYPOINT ["java","-jar","/app/cloudeurekaserver_7000.jar"]

#vscode 终端
#打包 vscode目录为./cloudeurekaserver_7000
#docker build ./cloudeurekaserver_7000 -t cloudeurekaserver_7000
#运行
#docker run -it -p 7000:7000 --name cloudeurekaserver_7000_container cloudeurekaserver_7000
#删除镜像
#docker image rm cloudeurekaserver_7000
#停止容器
#docker stop cloudeurekaserver_7000_container
#删除容器
#docker rm cloudeurekaserver_7000_container

#sudo docker exec -it cloudeurekaserver_7000 /bin/bash