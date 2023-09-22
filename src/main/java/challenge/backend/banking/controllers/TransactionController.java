package challenge.backend.banking.controllers;

import challenge.backend.banking.controllers.interfaces.TransactionControllerInterface;
import challenge.backend.banking.entities.inputs.TransactionInput;
import challenge.backend.banking.entities.outputs.TransactionOutput;
import challenge.backend.banking.services.TransactionService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/")
@RequiredArgsConstructor
public class TransactionController implements TransactionControllerInterface {
    private final TransactionService transactionService;
    @Override
    @PostMapping(path = "/transaction")
    public ResponseEntity<TransactionOutput> transaction(@RequestBody @Valid TransactionInput transactionInput) {
        return new ResponseEntity<TransactionOutput>(transactionService.executeTransaction(transactionInput), HttpStatus.OK);
    }
}
