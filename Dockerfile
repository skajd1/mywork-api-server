FROM openjdk:17-jdk-slim

CMD ["./gradlew", "clean", "build"]

WORKDIR /app

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
