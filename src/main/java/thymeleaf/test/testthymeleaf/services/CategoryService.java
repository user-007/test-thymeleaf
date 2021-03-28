package thymeleaf.test.testthymeleaf.services;

import thymeleaf.test.testthymeleaf.model.views.CategoryViewModel;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    public List<CategoryViewModel> getAllCategories();

}
