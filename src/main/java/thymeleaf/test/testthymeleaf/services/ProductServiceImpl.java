package thymeleaf.test.testthymeleaf.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import thymeleaf.test.testthymeleaf.model.entities.Category;
import thymeleaf.test.testthymeleaf.model.entities.Product;
import thymeleaf.test.testthymeleaf.model.entities.User;
import thymeleaf.test.testthymeleaf.repositories.ProductRepository;
import thymeleaf.test.testthymeleaf.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public ProductServiceImpl(ProductRepository productRepository, UserRepository userRepository, ModelMapper modelMapper2) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.modelMapper  = modelMapper2;
    }

    @Override
    public void getAllProducts() {
        List<Category> categories = new ArrayList<>();

        List<Product> allProducts =  productRepository.findAll();
        allProducts.forEach(me->{
           // Category category  = m
        });
    }
}
