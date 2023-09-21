package challenge.backend.banking.services.transactionValidations;

import challenge.backend.banking.entities.User;
import challenge.backend.banking.entities.inputs.TransactionInput;

public interface TransactionValidations {
    void validate(User payer, TransactionInput transactionInput);
}
