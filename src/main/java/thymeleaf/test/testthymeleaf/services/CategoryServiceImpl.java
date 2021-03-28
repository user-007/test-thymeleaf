package thymeleaf.test.testthymeleaf.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import thymeleaf.test.testthymeleaf.model.entities.Category;
import thymeleaf.test.testthymeleaf.model.entities.Product;
import thymeleaf.test.testthymeleaf.model.views.CategoryViewModel;
import thymeleaf.test.testthymeleaf.model.views.ProductViewModel;
import thymeleaf.test.testthymeleaf.repositories.ProductRepository;
import thymeleaf.test.testthymeleaf.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final ProductRepository productRepository;
    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public CategoryServiceImpl(ProductRepository productRepository, UserRepository userRepository, ModelMapper modelMapper2) {
        this.productRepository = productRepository;
        this.userRepository = userRepository;
        this.modelMapper  = modelMapper2;
    }

    @Override
    public List<CategoryViewModel> getAllCategories() {
        List<CategoryViewModel> categories = new ArrayList<>();

        List<Product> allProducts =  productRepository.findAll();
        allProducts.forEach(me->{
            //invoking the getter of category
         Category category = me.getCategory();
         Optional<CategoryViewModel> categoriesOpt = findByName(categories,category.getName());
         if(!categoriesOpt.isPresent()){
            CategoryViewModel newCategoryViewModel = new CategoryViewModel();
             modelMapper.map(category,newCategoryViewModel);
             categories.add(newCategoryViewModel);
             categoriesOpt = Optional.of(newCategoryViewModel);
         }
        });
        return categories;
    }
    private static Optional<CategoryViewModel>
    findByName(List<CategoryViewModel> allModels, String name) {
        return allModels.
                stream().
                filter(m-> m.getName().equals(name)).
                findAny();
    }
}
