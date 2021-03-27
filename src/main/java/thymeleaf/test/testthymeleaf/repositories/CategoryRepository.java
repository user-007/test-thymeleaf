package thymeleaf.test.testthymeleaf.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import thymeleaf.test.testthymeleaf.model.entities.Category;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category,String> {
@Query("SELECT c  from Category c")
public Optional<Category> getAllCategories();
}
