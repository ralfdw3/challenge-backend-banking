package challenge.backend.banking.services.transactionValidations;

import challenge.backend.banking.entities.User;
import challenge.backend.banking.entities.inputs.TransactionInput;
import challenge.backend.banking.enums.UserType;
import challenge.backend.banking.exceptions.BadRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OnlyUserTypeCommonCanSendMoney implements TransactionValidations {
    @Override
    public void validate(User payer, TransactionInput transactionInput) {
        UserType PayerUserType = payer.getUserType();

        if (PayerUserType == UserType.MERCHANT){
            log.error("""
                    Erro na regra: OnlyUserTypeCommonCanSendMoney.
                    Tipo do pagador: {}
                    """, PayerUserType);

            throw new BadRequestException("Lojistas não podem realizar transações");
        }
    }
}
