package thymeleaf.test.testthymeleaf.services;

import org.springframework.stereotype.Service;
import thymeleaf.test.testthymeleaf.model.entities.Product;
import thymeleaf.test.testthymeleaf.model.entities.User;
import thymeleaf.test.testthymeleaf.model.views.ProductViewModel;
import thymeleaf.test.testthymeleaf.repositories.ProductRepository;
import thymeleaf.test.testthymeleaf.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final UserRepository userRepository;

    public ProductServiceImpl(ProductRepository productRepository, UserRepository userRepository) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void getAllProducts() {
     List<ProductViewModel> products  = new ArrayList<>();
     List<Product> products_list  = productRepository.findAll();
    products_list.forEach(
            el->{
                User user  = el.getUsername();

            }
    );


    }
}
