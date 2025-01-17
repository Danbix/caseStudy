
FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/voiture-service-0.0.1-SNAPSHOT.jar

# 3) Copier le jar dans l'image
COPY ${JAR_FILE} app.jar

# 4) Exposer le port (ex : 8083 pour webclient-service)
EXPOSE 9000

# 5) Commande de lancement
ENTRYPOINT ["java","-jar","/app.jar"]
