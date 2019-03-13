#基于哪个镜像
FROM java:8-jre-alpine

MAINTAINER pleiyanger@gamil.com

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime

#创建目录
RUN mkdir -p /bms-eureka

#切换工作目录
WORKDIR /bms-eureka

#默认暴露的端口
EXPOSE 8761

ADD ./bms-eureka/target/bms-eureka.jar ./

CMD java -Djava.security.egd=file:/dev/./urandom -jar bms-eureka.jar
