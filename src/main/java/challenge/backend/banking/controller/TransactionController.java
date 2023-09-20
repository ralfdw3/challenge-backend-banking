package challenge.backend.banking.controller;

import challenge.backend.banking.controller.interfaces.TransactionControllerInterface;
import challenge.backend.banking.entity.transaction.TransactionInput;
import challenge.backend.banking.entity.transaction.TransactionOutput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/v1/")
public class TransactionController implements TransactionControllerInterface {
    @Override
    @PostMapping(path = "/transaction")
    public ResponseEntity<TransactionOutput> transaction(TransactionInput transactionInput) {
        return null;
    }
}
