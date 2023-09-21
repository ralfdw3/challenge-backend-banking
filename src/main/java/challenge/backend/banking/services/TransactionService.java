package challenge.backend.banking.services;

import challenge.backend.banking.entities.Transaction;
import challenge.backend.banking.entities.User;
import challenge.backend.banking.entities.inputs.TransactionInput;
import challenge.backend.banking.entities.outputs.TransactionOutput;
import challenge.backend.banking.repositories.TransactionRepository;
import challenge.backend.banking.services.transactionValidations.TransactionValidations;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;
    private final UserService userService;
    private final List<TransactionValidations> transactionValidations;

    @Transactional
    public TransactionOutput executeTransaction(final TransactionInput transactionInput){
        User payer = userService.findUserById(transactionInput.payer());
        User receiver = userService.findUserById(transactionInput.receiver());
        BigDecimal amount = transactionInput.amount();

        transactionValidations.forEach(validation -> validation.validate(payer, transactionInput));

        Transaction transaction = buildTransaction(payer, receiver, amount);
        transactionRepository.save(transaction);

        return buildTransactionOutput(transaction);
    }
    private static Transaction buildTransaction(User payer, User receiver, BigDecimal amount) {
        return Transaction.builder()
                .payer(payer)
                .receiver(receiver)
                .amount(amount)
                .build();
    }
    private static TransactionOutput buildTransactionOutput(Transaction transaction) {
        return TransactionOutput.builder()
                .id(transaction.getId())
                .build();
    }
}
