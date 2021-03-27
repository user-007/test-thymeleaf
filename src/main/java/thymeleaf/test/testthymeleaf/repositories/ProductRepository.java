package thymeleaf.test.testthymeleaf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import thymeleaf.test.testthymeleaf.model.entities.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,String> {
    //SELECT u FROM User u WHERE u.status = 1
    @Query("select p  from Product p")
    public List<Product> findAll();
}
