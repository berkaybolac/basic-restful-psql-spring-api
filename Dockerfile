FROM maven:3.6.0-jdk-11

EXPOSE 8080

ADD target/basic-restful-psql-spring-api.jar basic-restful-psql-spring-api.jar

ENTRYPOINT ["java","-jar", "basic-restful-psql-spring-api.jar"]
