package challenge.backend.banking.services.transactionValidations;

import challenge.backend.banking.entities.User;
import challenge.backend.banking.entities.inputs.TransactionInput;
import challenge.backend.banking.exceptions.BadRequestException;
import org.springframework.stereotype.Component;

@Component
public class PayerHaveEnoughMoneyToSend implements TransactionValidations {
    @Override
    public void validate(User payer, TransactionInput transactionInput) {
        if (payerDoesntHaveEnoughMoney(payer, transactionInput)){
            throw new BadRequestException("Saldo insuficiente para realizar a transação");
        }
    }

    private static Boolean payerDoesntHaveEnoughMoney(User payer, TransactionInput transactionInput) {
        return payer.getBalance().compareTo(transactionInput.amount()) < 0;
    }
}
