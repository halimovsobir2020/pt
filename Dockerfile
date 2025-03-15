FROM openjdk:17
EXPOSE 8080
ADD target/cicdpt.jar cicdpt.jar
ENTRYPOINT ["java","-jar","/cicdpt.jar"]