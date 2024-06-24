# Work Organizer
## Description
Team members can work under same project and can be a part of many projects. Task Management can be done efficiently with the system reulting in timely delivery of project.

## Todo
User setting, profile management, Task delivery Planning

## Dependencies
Java 8 JDK, Embedded Tomcat 9 server, MySQL DataBase, Maven

## Installation
* In Eclipse or similar IDE import the "backend" from this repo with option "import existing maven project".
* Build the maven project to install all the required dependencies.
* To setup database, install MySQL. Make any database.
* Then update below three configuration fields in file application.properties inside /resources folder
```
spring.datasource.url=jdbc:mysql://localhost:3306/woek_organizer
spring.datasource.username=root
spring.datasource.password=root
```
* For email services you need to use email via SMTP. For that you need to update application.properties below fields.
```
spring.mail.host=smtp.gmail.com
spring.mail.smtp.ssl.trust=smtp.gmail.com
spring.mail.port=587
spring.mail.transport.protocol=smtp
spring.mail.username=your.email@gmail.com
spring.mail.password=password
```
