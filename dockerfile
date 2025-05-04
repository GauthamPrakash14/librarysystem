# Use Maven image to both build and run the app
FROM maven:3.9.9-eclipse-temurin-21
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN ls -R ./src/test/java
# RUN mvn test -X
EXPOSE 8080
ENTRYPOINT ["mvn", "spring-boot:run"]
# ENTRYPOINT ["sh", "-c", "mvn test && mvn spring-boot:run"]
