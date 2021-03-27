package thymeleaf.test.testthymeleaf;

import org.springframework.boot.CommandLineRunner;
import thymeleaf.test.testthymeleaf.repositories.CategoryRepository;
import thymeleaf.test.testthymeleaf.repositories.ProductRepository;
import thymeleaf.test.testthymeleaf.repositories.UserRepository;

public class DBInit implements CommandLineRunner {
    private final CategoryRepository categoryRepository;
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    public DBInit(CategoryRepository categoryRepository, ProductRepository productRepository, UserRepository userRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }
    @Override
    public void run(String... args) throws Exception {

    }
    private void initializeCategories() {
     //ToDo: Initializing the categories
    }

}
