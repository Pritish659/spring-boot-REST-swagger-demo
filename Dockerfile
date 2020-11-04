FROM openjdk:11-jre-slim
COPY target/*.jar ./docker.jar
ENTRYPOINT ["java", "-jar", "/docker.jar"]
EXPOSE 8080
