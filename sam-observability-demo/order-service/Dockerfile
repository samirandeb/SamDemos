FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY ./target/*.jar order-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "order-service.jar"]