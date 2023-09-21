package challenge.backend.banking.controllers.interfaces;

import challenge.backend.banking.entities.inputs.TransactionInput;
import challenge.backend.banking.entities.outputs.TransactionOutput;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public interface TransactionControllerInterface {
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Successful transaction."),
            @ApiResponse(responseCode = "400", description = "Error performing the transaction.")
    })
    @Operation(description = "Generate a request for a new transaction between Users.")
    @PostMapping
    ResponseEntity<TransactionOutput> transaction(TransactionInput transactionInput);
}
