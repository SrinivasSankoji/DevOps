FROM openjdk:latest
COPY ./target/springboot-mysql-docker.jar springboot-mysql-docker.jar
WORKDIR /media/bhaumik/PERSONAL/DockerImages
ENTRYPOINT [ "java","-jar","/springboot-mysql-docker.jar" ]