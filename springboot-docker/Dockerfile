FROM openjdk:latest
COPY ./target/springboot-docker-0.0.1-SNAPSHOT.jar springboot-docker.jar
WORKDIR F:/DockerImages
ENTRYPOINT [ "java","-jar","/springboot-docker.jar" ]
EXPOSE 8080