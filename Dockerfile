FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/cicdtest-0.0.1-SNAPSHOT.jar /app/cicdtest-0.0.1-SNAPSHOT.jar
COPY target/lib /app/lib
COPY /src/main/resources/application.properties /app/src/main/resources/application.properties
COPY /src/main/resources/log4j2.xml /app/src/main/resources/log4j2.xml


CMD ["java", "-jar", "cicdtest-0.0.1-SNAPSHOT.jar", "--spring.config.location=file:/app/src/main/resources/application.properties"]
