package challenge.backend.banking.entities;

import challenge.backend.banking.enums.UserType;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Builder
@Entity
@Table(name = "Users")
@Getter
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
