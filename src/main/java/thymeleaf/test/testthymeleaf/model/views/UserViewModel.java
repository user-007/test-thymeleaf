package thymeleaf.test.testthymeleaf.model.views;

import java.util.ArrayList;
import java.util.List;

public class UserViewModel {
    private String name;
    private List<ProductViewModel> products = new ArrayList<>();
    public UserViewModel addProduct(ProductViewModel productViewModel){
        this.products.add(productViewModel);
        return this;
    }
    public UserViewModel setUsers(
            List<ProductViewModel> products
    ){
        this.products = products;
        return this;
    }

    public List<ProductViewModel> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "UserViewModel{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}
