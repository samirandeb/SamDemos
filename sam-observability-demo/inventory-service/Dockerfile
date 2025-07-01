FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY ./target/*.jar inventory-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "inventory-service.jar"]