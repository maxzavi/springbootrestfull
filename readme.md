# Create a API Rest full using Spring Boot, with Rest Repository, JPA and H2 Database

Create project using **Spring Boot Initializr**, add dependecies for **Rest Repository** (API rest full), **JPA** (object relational mappings and persistence) and **H2** (Database)

Add entity class, with constructor, using annotations: <b>@Entity for class</b>, and <b>@Id</b> , <b>@GeneratedValue(strategy = GenerationType.IDENTITY)</b> for id attribute
```java
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    public Product() {
        
    }
```

Create interface BeerRepository extends CrudRepository with object Beer, and type for id: Long, using annotation <b>@RepositoryRestResource</b>

```java
@RepositoryRestResource
public interface BeerRepository extends CrudRepository<Beer, Long>{
    
}
```

Add folder **test** and file call.rest use api call


