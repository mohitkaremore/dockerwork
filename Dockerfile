FROM openjdk:17

COPY target/mohitwork.jar /usr/app/

WORKDIR /usr/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "mohitwork"]