# Spring-Cloud-Mixed
Spring Boot + Spring Cloud + Eureka + Feign + Config + Hystrix

## Boot Start
Enable Cluster Eureka Servers, Achieve high availabilities
> `cd cloud-eureka-server`

> `mvn clean package`

> `java -jar cloud-eureka-server-0.0.1-SNAPSHOT.jar spring.profiles.active=s1`

> `java -jar cloud-eureka-server-0.0.1-SNAPSHOT.jar spring.profiles.active=s2`

Visit `http://localhost:8761` or `http://localhost:8762`

Run client1 and client2, revisit `http://localhost:8761`, a message indicating a client has set up will show up

Visit `http://localhost:8088/hi?name=xxx`, A hello message will be printed and indicate which serer is being used

Run feign applicatoin, visit `http://localhost:8090/hi?name=xxx`, test if two clients can switch the server ports periodically

* s1 and s2 here correspond to the names of the application.yml files, syntax is spring.profiles.active=xxx
* These jar packages can be run on several servers later on
* In the application.yml of two clients, the application name is the same, so feign will switch between these two ports randomly

