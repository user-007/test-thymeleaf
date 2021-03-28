package thymeleaf.test.testthymeleaf.model.entities;

import thymeleaf.test.testthymeleaf.model.entities.enums.UserRoleEnum;

import javax.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Enumerated(EnumType.STRING)
    private UserRoleEnum role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRole(UserRoleEnum role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "UserRoleEntity{" +
                "id='" + id + '\'' +
                ", role=" + role +
                '}';
    }
}
