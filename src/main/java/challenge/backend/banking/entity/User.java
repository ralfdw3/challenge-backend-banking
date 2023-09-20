package challenge.backend.banking.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    Long id;
    String name;
    String email;
    String password;
    BigDecimal balance;
}
