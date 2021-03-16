FROM openjdk:latest
COPY ./target/employee-producer.jar employee-producer.jar
ENTRYPOINT [ "java","-jar","/employee-producer.jar" ]
EXPOSE 8600