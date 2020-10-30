From openjdk:11
COPY target/amazon-demo-0.0.1-SNAPSHOT.jar amazon-demo-0.0.1-SNAPSHOT.jar 
EXPOSE 8080
ENTRYPOINT ["java", "-jar" , "amazon-demo-0.0.1-SNAPSHOT.jar"]