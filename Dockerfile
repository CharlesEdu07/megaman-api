FROM ubuntu:latest AS builder

RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
COPY . .

RUN apt-get install maven -y
RUN mvn clean install

FROM openjdk:17-jdk-slim

EXPOSE 8080

COPY --from=build /target/megamanapi-0.0.1-SNAPSHOT.jar /megamanapi.jar

ENTRYPOINT ["java", "-jar", "/megamanapi.jar"]
