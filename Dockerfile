FROM eclipse-temurin:17-jre

COPY ./target/WeatherApi-0.0.1.jar /app.jar

ENTRYPOINT ["java","-jar","/app.jar"]


