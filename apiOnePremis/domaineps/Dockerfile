FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
EXPOSE 8081 80
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]