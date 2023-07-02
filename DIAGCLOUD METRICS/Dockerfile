FROM openjdk:19-jdk-alpine as builder
WORKDIR /opt/app
COPY .m2 .m2
COPY .mvn .mvn
COPY mvnw pom.xml ./
RUN chmod +x ./mvnw
# RUN ./mvnw -s .m2/settings.xml dependency:go-offline
COPY src ./src
#RUN ./mvnw package spring-boot:repackage
RUN ./mvnw package spring-boot:repackage -DskipTests=true
FROM openjdk:19-jdk-alpine
WORKDIR /opt/app
EXPOSE 8081
COPY --from=builder /opt/app/target/*.jar /opt/app/app.jar
COPY src/main/resources/application-dev.properties /opt/app/application.properties
ENTRYPOINT ["java", "-jar", "/opt/app/app.jar"]

