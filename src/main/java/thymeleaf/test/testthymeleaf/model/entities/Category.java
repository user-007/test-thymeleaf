package thymeleaf.test.testthymeleaf.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
    @Id
    private String id;
    //@CustomOption
    private String name;
    private String description;

}
