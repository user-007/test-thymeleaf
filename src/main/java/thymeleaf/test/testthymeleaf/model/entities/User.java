package thymeleaf.test.testthymeleaf.model.entities;

import org.thymeleaf.spring5.processor.SpringActionTagProcessor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;
import java.util.List;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //one user can have many products
    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
