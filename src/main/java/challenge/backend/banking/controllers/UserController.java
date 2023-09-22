package challenge.backend.banking.controllers;

import challenge.backend.banking.controllers.interfaces.UserControllerInterface;
import challenge.backend.banking.entities.inputs.UserInput;
import challenge.backend.banking.entities.outputs.UserOutput;
import challenge.backend.banking.services.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/")
@RequiredArgsConstructor
public class UserController implements UserControllerInterface {
    private final UserService userService;
    @Override
    public ResponseEntity<UserOutput> createUser(@RequestBody @Valid UserInput userInput) {
        return new ResponseEntity<UserOutput>(userService.createUser(userInput), HttpStatus.CREATED);
    }
}
