package challenge.backend.banking.entity.transaction;

import challenge.backend.banking.entity.User;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Builder;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

@Entity
@Table(name = "Transactions")
@Builder
public class Transaction {
    @Id
    Long id;
    User receiver;
    User payer;
    BigDecimal value;
}
