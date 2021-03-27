package thymeleaf.test.testthymeleaf.model.entities.services.impl;

import org.springframework.stereotype.Service;
import thymeleaf.test.testthymeleaf.model.entities.Category;
import thymeleaf.test.testthymeleaf.model.entities.services.CategoryService;
import thymeleaf.test.testthymeleaf.repositories.CategoryRepository;

import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }


    @Override
    public void checkInitializeWhenNotInDB() {
        Optional<Category> categories = categoryRepository.getAllCategories();
        if(categories.isEmpty()){

        }
        else{

        }
    }
}

