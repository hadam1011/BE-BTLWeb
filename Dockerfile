#
# Package stage
#
FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY /target/demo-0.0.1-SNAPSHOT.jar app.jar
# ENV PORT=8080
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]