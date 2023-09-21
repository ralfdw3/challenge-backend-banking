package challenge.backend.banking.services.transactionValidations;

import challenge.backend.banking.entities.User;
import challenge.backend.banking.entities.inputs.TransactionInput;
import challenge.backend.banking.exceptions.BadRequestException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@Slf4j
public class PayerHaveEnoughMoneyToSend implements TransactionValidations {
    @Override
    public void validate(User payer, TransactionInput transactionInput) {
        BigDecimal payerBalance = payer.getBalance();
        BigDecimal transactionAmount = transactionInput.amount();

        if (payerDoesntHaveEnoughMoney(payerBalance, transactionAmount)){
            log.error("""
                    Erro na regra: PayerHaveEnoughMoneyToSend.
                    Saldo do pagador: {}
                    Quantia a ser paga: {}
                    """, payerBalance, transactionAmount);

            throw new BadRequestException("Saldo insuficiente para realizar a transação");
        }
    }

    private static Boolean payerDoesntHaveEnoughMoney(BigDecimal payerBalance, BigDecimal transactionAmount) {
        return payerBalance.compareTo(transactionAmount) < 0;
    }
}
