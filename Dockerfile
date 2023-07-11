FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
RUN name: Set up Docker Buildx
  uses: docker/setup-buildx-action@v1
  with:
     version: v0.7.0
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080