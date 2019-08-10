FROM openjdk:8u181-jdk-alpine
ARG workdir=/app
ARG package=webapp-SNAPSHOT.jar
VOLUME ${workdir}
WORKDIR ${workdir}
ADD ./target/${package} app.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]