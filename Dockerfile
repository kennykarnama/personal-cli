FROM maven:3.6.3-jdk-11-slim

WORKDIR /app

COPY . .

RUN mvn clean install

ENTRYPOINT [ "java", "-jar", "target/personal-cli-1.0-jar-with-dependencies.jar" ]
