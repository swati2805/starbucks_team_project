# CMPE 202-Starbucks-Team-Project README

Swati Shukla
Vanushri Rawat
Odkhuu Batmunkh

# Team work distribution
1) POST Add Card API - Vanushri
2) POST Manage order API - Odkhuu
3) POST Make a Payment API - Swati
5) GET Store API - Everyone
6) Deploy to AutoScaled EC2 cluster with load balancer - Everyone
7) Deploy as a Docker Container in AWS-Elastic Container Services - Everyone

# Design Approach
1) Domain Component :
 
 a) We reused the base code from our individual Strbucks Project and added a persistance layer for all the objects such as :   Card, Order Cart and Stores.
 
 b) We wrote additional business layer on top of the base code that interacts with the ersistance layer.

c) Packed all of the code into a jar and imported into our Spring project.

d) The project has capability to be connected to the DB if at any poinyt we decide to intoducce MYSQL.
 
 2) Created Spring Controller layer having POST and GET methods that interacts with the business layer and can be called directly from Postman.
 
 3) Design Patterns Used:
   
   a) Singleton - As there is no DB involved as of now, we have created the Starbucks card and Order cart as Singleton        objects.
   
   b) Adapter - For the manage order API, the Drinks and Add ons have been implemented as Interfaces.
   
   c) Decorator pattern - In order to calculate the price of the drinks we have implemented the Decorator pattern so that         multiple addons can be added and dynamic price can be calculated.

4) APIs implemented:
 1) Manage Order : lets the user place orders
    Interacts with the payment API internally
        
 2) Add Card : lets the user add cards with initial balance
    Card number validation
    Card Code validation
    
 3) Payment : lets the user make payment for orders in the order cart
 4) Store : Lets the user find near by stores according to your current location

# Task one: implement APIs

We have used the base code in our individual starbucks app. 
The base code we have migrated it from a Gradle project into a Maven project.
Inside the new maven project we have imported SpringBoot libraries. 
Inside the pom.xml we have specified all the dependencies. 

Using springboot libraries we have mapped each Java methods into API calls by creating Controller classes. 
We have mapped all 3 POST methods (add card, manager order, and make payment) and 1 GET method (store) inside each corresponding Controller class. There is no token authentication for REST-APIs; however, all the variables for each REST-API call is passed on through body in JSON format. 

Using Spring Boot we have deployed our maven project as a micro-web-service on port 8080. 

Please find our Maven project with Spring Boot implementation here:
https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/workspace-spring-tool-suite-4-4.2.1.RELEASE.zip

Screenshots of sample APIs to AWS instances:

![alt text](https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/1.jpeg)


![alt text](https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/2.jpeg)


![alt text](https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/3.jpeg)


![alt text](https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/5.jpeg)





# Task two: Deploy to AWS (ec2 cluster + docker containers)

1) Deploying in an EC2 cluster with Auto Scaling group and elastic load balancers:
-We have deployed our micro-webservice in an EC-2 instance (windows server 2019 AMI) with all the JDK and SpringBoot dependencies.
-EC-2 instance was attached into a newly created Auto-scaling group. Scaling group is configured to max size of 1. So whenever the instance stops or terminates, a new instance with the same AMI will be launced
-We also have attached an Elastic network Load balancer into our EC-2 instance

2) Deploying to AWS as Docker Containers in Amazon Elastic Containers Service.
-We have created a new ECS (Elastic Container Service) cluster
-We have created a new AMI image from the EC-2 instance from step 1 since it already contains our API deployments with the libraries and dependencies
-We have created a new container that includes the AMI
-We have deployed the container in the ECS cluster 



![alt text](https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/aws1.png)

![alt text](https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/aws2.png)

![alt text](https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/aws3.png)

![alt text](https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/aws4.png)

**Deployment diagram**
![alt text](https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/dep_202.jpg)

**Component Diagram**
![alt text](https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/comp_202.jpg)

**Architecture Diagrams**

![alt text](https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/ArchDiaAWS.png)

![alt text](https://github.com/vanushri/202-Starbucks-Team-Project/blob/master/Arche_Dia_Container.jpg)

