FROM amazoncorretto:17-alpine-jdk

MAINTAINER RCharry

COPY  target/rcharry-0.0.1-SNAPSHOT.jar  rcharry-app.jar   

EXPOSE 8080

ENTRYPOINT  ["java", "-jar", "rcharry-app.jar"]
