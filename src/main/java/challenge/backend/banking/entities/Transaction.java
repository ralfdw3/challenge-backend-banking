package challenge.backend.banking.entities;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Entity
@Table(name = "Transactions")
@Builder
@Getter
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    User receiver;
    @ManyToOne
    @JoinColumn(name = "payer_id")
    User payer;
    BigDecimal amount;
}
