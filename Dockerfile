
FROM amazoncorretto:11-alpine-jdk


MAINTAINER   RCharry  


COPY  target/rcharry-0.0.1-SNAPSHOT.jar  rcharry-app.jar   


ENTRYPOINT  ["java", "-jar", "rcharry-app.jar"]
