package thymeleaf.test.testthymeleaf.model.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.*;

@Entity
@Table(name ="user")
public class User {
    @Id
    private String id;
    @Size(min=3,max = 20)
    private String username;
    @Size(min=3,max=20)
    private String password;
    @Email
    @NotBlank
    private String email;
}
