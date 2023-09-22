package challenge.backend.banking.services;

import challenge.backend.banking.exceptions.BadRequestException;
import challenge.backend.banking.services.transactionValidations.OnlyUserTypeCommonCanSendMoney;
import challenge.backend.banking.services.transactionValidations.PayerHaveEnoughMoneyToSend;
import org.junit.jupiter.api.Test;

import static challenge.backend.banking.stubs.TransactionsStub.transactionInputDefault;
import static challenge.backend.banking.stubs.UserStub.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TransactionServiceTest {
    @Test
    void should_returnOk_when_validateOnlyUserTypeCommonCanSendMoney() {
        assertDoesNotThrow(() -> new OnlyUserTypeCommonCanSendMoney().validate(commonUser(), transactionInputDefault()));
    }

    @Test
    void should_throwBadRequestException_when_merchantUserTryToSendMoney() {
        assertThrows(BadRequestException.class,
                () -> new OnlyUserTypeCommonCanSendMoney().validate(merchantUser(), transactionInputDefault()));
    }

    @Test
    void should_returnOk_when_validatePayerHaveEnoughMoneyToSend() {
        assertDoesNotThrow(() -> new PayerHaveEnoughMoneyToSend().validate(commonUser(), transactionInputDefault()));
    }

    @Test
    void should_throwBadRequestException_when_userDoesntHaveEnoughMoneyToSend() {
        assertThrows(BadRequestException.class,
                () -> new PayerHaveEnoughMoneyToSend().validate(commonUserWithNoMoney(), transactionInputDefault()));
    }

}