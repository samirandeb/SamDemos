FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY ./target/*.jar notification-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "notification-service.jar"]