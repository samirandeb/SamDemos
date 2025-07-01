FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY ./target/*.jar product-service.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "product-service.jar"]