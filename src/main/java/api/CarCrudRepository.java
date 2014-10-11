package api;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.CrudRepository;
import api.Car;
 
@RepositoryRestResource(collectionResourceRel = "crud", path = "crud")
public interface CarCrudRepository extends CrudRepository<Car, Long> {}