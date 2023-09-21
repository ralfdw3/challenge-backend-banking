package challenge.backend.banking.services.transactionValidations;

import challenge.backend.banking.entities.User;
import challenge.backend.banking.entities.inputs.TransactionInput;
import challenge.backend.banking.enums.UserType;
import challenge.backend.banking.exceptions.BadRequestException;
import org.springframework.stereotype.Component;

@Component
public class OnlyUserTypeCommonCanSendMoney implements TransactionValidations {
    @Override
    public void validate(User payer, TransactionInput transactionInput) {
        if (payer.getUserType() == UserType.MERCHANT){
            throw new BadRequestException("Lojistas não podem realizar transações");
        }
    }
}
