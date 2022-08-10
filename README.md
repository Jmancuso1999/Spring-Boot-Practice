# Spring-Boot-Practice

![image](Model-view-controller-service.jpeg)

## NOTE: This is a very basic example of Spring Boot - Google other Spring boot repos to better understand what each layer (model, services, controllers) should contain.

[Stack Overflow Definition](https://stackoverflow.com/questions/5702391/mvcs-model-view-controller-service)

View - Front End component (EX: ReactJS)

Controller - The controller defines entry points that clients from the outside world can talk with using REST operations. A controller controls the logic. 

Service - In an application, the business logic resides within the service layer ([defined here](https://www.geeksforgeeks.org/spring-service-annotation-with-example/)). This is where we want to create all the functions needed ([example](https://github.com/in28minutes/spring-boot-examples/blob/master/spring-boot-rest-services/src/main/java/com/in28minutes/springboot/service/StudentService.java))

Model - This is what's connected to the database (Spring allows you to define tables and columns within the class). The application logic is defined here.


## Rest API vs Microservice

### Rest API


### Microservice 
<img width="624" alt="image" src="https://user-images.githubusercontent.com/43454765/183819626-5d5ed464-f84a-4311-ac50-0ab5fab5bb58.png">
