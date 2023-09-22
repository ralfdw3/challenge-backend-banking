package challenge.backend.banking.entities.inputs;

import challenge.backend.banking.enums.UserType;
import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public record UserInput(
        @NotBlank
        String name,
        @NotBlank
        String password,
        @NotBlank
        String email,
        @NotBlank
        String document,
        @NotBlank
        BigDecimal balance,
        @NotBlank
        UserType userType
) {
}
