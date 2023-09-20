package challenge.backend.banking.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "CommonUsers")
@Builder
public class CommonUser extends User {
    String cpf;
}
