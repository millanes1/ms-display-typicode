FROM java:openjdk-8-jdk

ADD target/typicode-swarm.jar /opt/typicode-swarm.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/typicode-swarm.jar"]