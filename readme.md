## Spring boot - Simple Auth Login and Register

## System Requirements
- Java openjdk : ( version "17.0.2")
- Spring Boot : (version 3.2.5)
- H2 Database Engine : (Version 2.2.224 (2023-09-17))
- Maven : (Apache Maven 3.9.3)
- Editor : (Intellij IDEA 2023.1.1 Community Edition)

## Dependencis

- Spring Data JPA
- Spring Web
- MySQL Driver
- Thymeleaf
- Spring security
- Spring Boot DevTools


## run project

1. clone project Spring boot - Simple Auth Login and Register
```
git clone https://github.com/rardan97/spring-boot-auth-mysql.git
```

2. add new database mysql with name "db_spring_auth"

3. open project with intellij IDEA then edit config database in application.properties change database name, username and password match your config db

   #### location : spring-boot-auth-mysql/src/main/resources/application.properties

```
spring.application.name=spring-boot-auth-mysql
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/db_spring_auth
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect

```

4. open terminal input command
```
mvn clean install 
```
5. if success next input command
```
mvn spring-boot:run
```