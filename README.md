# Web App: Order Management System

### About

CRUD (create, read, update, delete) Web application for managing moving orders.

**Backend:** Java, Spring Boot, JPA, MySQL.<br/>
**Frontend:** React.js
<br/><br/>
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

The database consists of one table represented by the class `Order`. The attributes are:

| Attribute  |  Type  | 
|---|---|
| id  | Long (primary key)  |
| name  | String  |
|  email |  String |
|  addressMovingTo |  String |
|  addressMovingFrom |  String |
|  moving |  boolean |
|  packing |  boolean |
|  cleaning |  boolean |
|  orderNote |  String |

The primary key `id` is auto-generated. Few constraints on the attributes are enforced.
<br/>
#### API design

The available HTTP REST mappings are:
* `GET: /orders` - returns all entities in the database in JSON-format.
* `GET: /orders/{id}` - returns entity with given id in the database in JSON-format, if entity exists.
* `POST: /orders` - creates entity with given parameters in the database.
* `DELETE: /orders/{id}` - removes entity with given id in the database, if entity exists.
* `PUT: /orders/{id}` - updates entity with given id in the database in JSON-format, if entity exists.

Some of the REST methods throw exceptions whenever used improperly and a basic controller test is available in `OrderControllerTest.java` in the folder `\src\test`. Postman were also used to test all REST mappings.
<br/>
#### Frontend design

The main JavaScript-file is `App.js` within the folder `.\frontend\src` and is currently connected to the component `Orders` found in `.\frontend\src\orders.js`. The idea is that the landing page fetches all registered entities in the database and renders them in a tabular manner according to `orders.js`. The action events are handled by buttons and their `onClick`-events are found in `click.js`. Currently, only the Delete-buttion is functioning.<br/><br/>

## Demonstrations

#### DELETE

<img src="https://raw.githubusercontent.com/amoeedm/order-placement-system/master/img/deleteFE.gif">
<img src="https://raw.githubusercontent.com/amoeedm/order-placement-system/master/img/delete.gif">


#### GET

<img src="https://raw.githubusercontent.com/amoeedm/order-placement-system/master/img/get.gif">

#### POST

<img src="https://raw.githubusercontent.com/amoeedm/order-placement-system/master/img/post.gif">

#### PUT

<img src="https://raw.githubusercontent.com/amoeedm/order-placement-system/master/img/put.gif">


## Workflow

## Limitations

## Future improvements
