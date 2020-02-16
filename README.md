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

<img src="https://raw.githubusercontent.com/amoeedm/order-placement-system/master/img/deletefrontend.gif">
<img src="https://raw.githubusercontent.com/amoeedm/order-placement-system/master/img/delete.gif">


#### GET

<img src="https://raw.githubusercontent.com/amoeedm/order-placement-system/master/img/get.gif">

#### POST

<img src="https://raw.githubusercontent.com/amoeedm/order-placement-system/master/img/post.gif">

#### PUT

<img src="https://raw.githubusercontent.com/amoeedm/order-placement-system/master/img/put.gif"><br/><br/>


## Workflow

For detailed commits, see <a href="https://github.com/amoeedm/order-placement-system/commits/master">this</a>. The workflow has roughly followed:

1. Design @Entity with minimal attributes.
2. Design basic @RestController with @PostMapping and @GetMapping.
3. Connecting MySQL database through JPA.
4. Verifying succssful POST and GET with Postman.
5. Design remaining @RestControllers such as @DeleteMapping and @PutMapping.
6. Verifying successful DELETE and POST with Postman.
7. Basic JUnit test and @SpringBootTest.
8. Modifying @RestControllers to be more robust.
9. Fetching data in React.js.
10. Adding frontend components without functions.
11. Adding generic actions based upon events such as onClick.
12. Made DELETE functioning through frontend.
13. Tried to make POST and PUT functioning through frontend.
14. Tried to bundle with Webpack.
15. Created and written README.md.

Basic idea has been to break problems down to smaller problems, make a functioning implementation, then adding all functions and continuing to next small problem.<br/><br/>


## Future improvements

* **Frontend:** make POST, PUT and GET (param: {id}) functioning.
* **Security:** add authentication for different sales consultants.
* **Search:** add search function.
* **Sort:** add sort function for each column.
* **Add owner column:** each order is owned by a sales consultant.
* **Database design:** restrict variables to more constraint values (ex. emails must contain @; phone numbers must be at least 8 digits etc.)
* **Tests:** more JUnit tests of methods and REST-tests.
* **Documentation:** add more comments in code.
