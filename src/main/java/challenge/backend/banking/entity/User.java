package challenge.backend.banking.entity;

import lombok.Builder;
import org.springframework.data.annotation.Id;

@Builder
public class User {
    @Id
    String id;
    String name;
    String email;
    String password;
}
