FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY ./target/*.jar api-gateway.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=docker", "api-gateway.jar"]