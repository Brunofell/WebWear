FROM eclipse-temurin:21-jdk
ARG JAR_FILE=target/*.jar
COPY ./target/WebWear-0.0.1-SNAPSHOT.jar webwear.jar
ENTRYPOINT ["java", "-jar", "/webwear.jar"]