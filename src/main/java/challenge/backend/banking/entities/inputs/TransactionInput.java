package challenge.backend.banking.entities.inputs;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record TransactionInput(
        @NotNull
        Long receiver,
        @NotNull
        Long payer,
        @NotNull
        BigDecimal amount) {
}
