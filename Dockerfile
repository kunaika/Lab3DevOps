FROM openjdk:17
ADD target/Lab3DevOps.jar Lab3DevOps.jar
ENTRYPOINT ["java", "-jar", "/Lab3DevOps.jar"]