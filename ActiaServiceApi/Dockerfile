FROM openjdk:19-jdk-alpine as builder
WORKDIR /opt/app
COPY .m2/ .m2
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x ./mvnw
# RUN ./mvnw -s .m2/settings.xml dependency:go-offline
COPY ./src ./src
RUN ./mvnw package spring-boot:repackage

FROM openjdk:19-jdk-alpine
WORKDIR /opt/app
EXPOSE 8080
COPY --from=builder /opt/app/target/*.jar /opt/app/app.jar
ENTRYPOINT ["java", "-jar", "/opt/app/app.jar"]
ENV MANAGEMENT_ENDPOINTS_WEB_EXPOSURE_INCLUDE=*
ENV MANAGEMENT_METRICS_EXPORT_PROMETHEUS_ENABLED=true