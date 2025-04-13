FROM openjdk:17
VOLUME /tmp
COPY target/SampleApplication-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/app.jar"]