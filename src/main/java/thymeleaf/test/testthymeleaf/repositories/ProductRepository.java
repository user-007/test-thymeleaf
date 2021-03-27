package thymeleaf.test.testthymeleaf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import thymeleaf.test.testthymeleaf.model.entities.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,String> {

}
