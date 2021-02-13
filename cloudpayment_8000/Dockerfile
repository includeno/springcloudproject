#指定基础镜像，在其上进行定制 docker pull openjdk:11-jre
FROM openjdk:11-jre

#声明运行时容器提供服务端口，这只是一个声明，在运行时并不会因为这个声明应用就会开启这个端口的服务
EXPOSE 8000

WORKDIR /app
ADD . /app

COPY target/cloudpayment_8000-1.0-SNAPSHOT.jar /app/cloudpayment_8000.jar

#指定容器启动程序及参数   <ENTRYPOINT> "<CMD>"
ENTRYPOINT ["java","-jar","/app/cloudpayment_8000.jar"]

#vscode 终端
#打包 vscode目录为./cloudpayment_8000
#docker build ./cloudpayment_8000 -t cloudpayment_8000
#运行
#docker run -it -p 8000:8000 --name cloudpayment_8000_container cloudpayment_8000
#删除镜像
#docker image rm cloudpayment_8000
#停止容器
#docker stop cloudpayment_8000_container
#删除容器
#docker rm cloudpayment_8000_container

#sudo docker exec -it cloudpayment_8000 /bin/bash