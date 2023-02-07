#FROM amazoncorretto:8u362-alpine3.16-jre
FROM amazoncorretto:17.0.6-alpine3.16

LABEL maintainer="nahwu"
COPY /target/spring-on-java-0.0.1-SNAPSHOT.jar   /var/tmp/my-app/
RUN chmod -R 700 /var/tmp/my-app/spring-on-java-0.0.1-SNAPSHOT.jar
WORKDIR /var/tmp/my-app

EXPOSE 8000

CMD ["java", "-jar", "spring-on-java-0.0.1-SNAPSHOT.jar"]
