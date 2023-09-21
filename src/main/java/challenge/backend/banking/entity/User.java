package challenge.backend.banking.entity;

import challenge.backend.banking.enums.UserType;
import jakarta.persistence.*;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    String password;
    String document;
    BigDecimal balance;
    UserType userType;
}
