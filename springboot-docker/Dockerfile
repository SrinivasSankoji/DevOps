FROM openjdk:latest
COPY ./target/springboot-docker.jar springboot-docker.jar
WORKDIR /media/bhaumik/PERSONAL/DockerImages
ENTRYPOINT [ "java","-jar","/springboot-docker.jar" ]
EXPOSE 8080