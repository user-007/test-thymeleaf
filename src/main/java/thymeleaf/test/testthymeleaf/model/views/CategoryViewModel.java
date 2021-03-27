package thymeleaf.test.testthymeleaf.model.views;

import java.util.List;

class CategoryViewModel{
private String name;
private List<ProductViewModel> products;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProductViewModel> getProducts() {
        return products;
    }

    public void setProducts(List<ProductViewModel> products) {
        this.products = products;
    }
    public CategoryViewModel addCategory(ProductViewModel pvm){
        products.add(pvm);
        return this;
    }

    @Override
    public String toString() {
        return "CategoryViewModel{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}