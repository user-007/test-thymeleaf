package thymeleaf.test.testthymeleaf.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import thymeleaf.test.testthymeleaf.model.entities.Product;
import thymeleaf.test.testthymeleaf.model.entities.User;
import thymeleaf.test.testthymeleaf.model.views.ProductViewModel;
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
     List<ProductViewModel> products  = new ArrayList<>();
     List<Product> products_list  = productRepository.findAll();
    products_list.forEach(
            //returning all products of the given user ;
            el->{
                User user  = el.getUser();
                Optional<ProductViewModel> productViewModel  = findByName(products, user.getUsername());
                if(!productViewModel.isPresent()){
                    // not in the result then creating a new model
                    ProductViewModel newProductViewModel  = new ProductViewModel();
                    modelMapper.map(user, new ProductViewModel());
                    products.add(newProductViewModel);
                    //assigning the new object
                    productViewModel = Optional.of(newProductViewModel);
                }
            }
    );


    }
    private static Optional<ProductViewModel> findByName(List<ProductViewModel> allModels, String name){
        return allModels.
                stream().
                filter(m-> m.getName().equals(name)).
                findAny();
    }
}
