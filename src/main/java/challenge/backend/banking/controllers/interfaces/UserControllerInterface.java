package challenge.backend.banking.controllers.interfaces;

import challenge.backend.banking.entities.inputs.UserInput;
import challenge.backend.banking.entities.outputs.UserOutput;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

public interface UserControllerInterface {
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "User created."),
            @ApiResponse(responseCode = "400", description = "Error creating user.")
    })
    @Operation(description = "Generate a request for a new user.")
    @PostMapping
    ResponseEntity<UserOutput> createUser(UserInput userInput);
}
