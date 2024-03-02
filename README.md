# Spring Boot Weather Api

This is Spring Boot micro-service application that can be containerized and subsequently executed in Docker.

### Create JAR file and build docker image
```
mvn clean package docker:build
```

### Control generated image
```
docker images
```
```
REPOSITORY                TAG       IMAGE ID       CREATED              SIZE
spring-boot-weather-api   latest    4ca2025020c3   About a minute ago   315MB
```
