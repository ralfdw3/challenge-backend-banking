package challenge.backend.banking.entities.outputs;

import lombok.Builder;

@Builder
public record UserOutput(
        Long id,
        String name
) {
}
