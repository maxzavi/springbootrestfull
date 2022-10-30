package pe.maxz.springbootrestfull.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import pe.maxz.springbootrestfull.entity.Product;
@RepositoryRestController
public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
