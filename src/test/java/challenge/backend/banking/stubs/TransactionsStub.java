package challenge.backend.banking.stubs;

import challenge.backend.banking.entities.inputs.TransactionInput;

import java.math.BigDecimal;

public interface TransactionsStub {

    long ID_PAYER_ONE = 1L;
    long ID_RECEIVER_TWO = 2L;
    BigDecimal AMOUNT_TEN = BigDecimal.TEN;

    static TransactionInput.TransactionInputBuilder transactionInputBuilderDefault() {
        return TransactionInput.builder()
                .payer(ID_PAYER_ONE)
                .receiver(ID_RECEIVER_TWO)
                .amount(AMOUNT_TEN);
    }
    static TransactionInput transactionInputDefault() {
        return transactionInputBuilderDefault().build();
    }
}
