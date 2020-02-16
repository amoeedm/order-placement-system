# Order Management System

### About

CRUD (create, read, update, delete) Web application for managing moving orders.

**Backend:** Java, Spring Boot, JPA, MySQL.<br/>
**Frontend:** React.js
<br/>
<img src="https://raw.githubusercontent.com/amoeedm/order-placement-system/master/img/main_image.PNG">

### Installation

1. Download or clone current repository.
2. Compile and run `OrderPlacementSystemApplication.java` found in folder `.\src\main\java\com.crudrest.orderplacement.orderplacement.system\`
3. API Service availablle at `localhost:8080/orders`
4. Within folder `\frontend`, run `npm start` (you may have to install additional packages).
5. Access frontend at `localhost:3000`
<br/><br/>

### Architecture

#### Database design

Database initiated locally on MySQL Server with the following commands:
```sql
CREATE DATABASE orders;
CREATE USER 'admin'@'%' IDENTIFIED BY 'password';
GRANT ALL ON orders.* TO 'admin'@'%';
```
The user is adviced to use more secure username then `admin` and password as `password`. Corresponding changes must be applied to `application.properties` within the folder `.\src\main\resources\`.



## Demonstrations

## Workflow

## Limitations

## Future improvements
