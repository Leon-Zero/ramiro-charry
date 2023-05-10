# Imagen base
#de que imagen partimos
FROM amazoncorretto:11-alpine-jdk

# Establece el directorio de trabajo
#nombre del autor
MAINTAINER   RCharry  

# Copia el archivo jar a la imagen
# copia el empaquetado en github
COPY  target/rcharry-0.0.1-SNAPSHOT.jar  rcharry-app.jar   

#ejecucion que va a realizar primero
ENTRYPOINT  ["java", "-jar", "rcharry-app.jar"]
