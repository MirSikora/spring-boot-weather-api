# Spring Boot Weather Api

This is Spring Boot micro-service application that can be containerized and subsequently executed in Docker.

<img src='https://www.mirsikora.cz/images/projects/spring_weather_api.png' width="50%" style="text-align:center;">

### Create JAR file and build docker image
```
mvn clean package docker:build
```

### Check generated image
```
docker images
```
```
REPOSITORY                TAG       IMAGE ID       CREATED              SIZE
spring-boot-weather-api   latest    4ca2025020c3   About a minute ago   315MB
```

### Run application by docker container
```
docker run -d -p 8080:8080 spring-boot-weather-api 
```

>View running application in the browser at http://localhost:8080/

### Verify running container
```
docker ps
```
```
CONTAINER ID   IMAGE                     COMMAND                CREATED          STATUS          PORTS                    NAMES
dff519692024   spring-boot-weather-api   "java -jar /app.jar"   12 minutes ago   Up 12 minutes   0.0.0.0:8080->8080/tcp   hardcore_sinoussi
```

### Stop docker container
```
docker stop dff519692024
```

### Remove docker container 
```
docker rm -f dff519692024
```

### Remove docker image 
```
docker rmi 4ca2025020c3
```
