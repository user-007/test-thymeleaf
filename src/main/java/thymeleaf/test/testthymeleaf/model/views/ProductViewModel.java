package thymeleaf.test.testthymeleaf.model.views;

import thymeleaf.test.testthymeleaf.model.entities.enums.CategoryEnum;

import java.time.LocalDateTime;

public class ProductViewModel{

private String name;
private CategoryEnum category;
private String price;
private LocalDateTime localDateTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "ProductViewModel{" +
                "name='" + name + '\'' +
                ", category=" + category +
                ", price='" + price + '\'' +
                ", localDateTime=" + localDateTime +
                '}';
    }
}