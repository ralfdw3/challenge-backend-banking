package challenge.backend.banking.entity;

import challenge.backend.banking.entity.User;
import jakarta.persistence.*;
import lombok.Builder;

import java.math.BigDecimal;

@Entity
@Table(name = "Transactions")
@Builder
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
    BigDecimal value;
}
