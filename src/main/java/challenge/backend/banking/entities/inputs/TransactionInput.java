package challenge.backend.banking.entities.inputs;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

import java.math.BigDecimal;

@Builder
public record TransactionInput(
        @NotNull
        Long receiver,
        @NotNull
        Long payer,
        @NotNull
        BigDecimal amount) {
}
