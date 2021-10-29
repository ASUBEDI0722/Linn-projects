FROM adoptopenjdk/openjdk15:ubi
VOLUME /tmp
COPY target/CustomerRegistrationPortal-0.0.1-SNAPSHOT.jar CustomerRegistrationPortal-0.0.1-SNAPSHOT.jar
EXPOSE 9999
ENTRYPOINT ["java", "-jar", "/CustomerRegistrationPortal-0.0.1-SNAPSHOT.jar"]