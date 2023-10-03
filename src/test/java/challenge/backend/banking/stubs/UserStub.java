package challenge.backend.banking.stubs;

import challenge.backend.banking.entities.User;
import challenge.backend.banking.enums.UserType;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

public interface UserStub {

    String NAME = "Fulano Ciclano";
    String PASSWORD = "password";
    String EMAIL_PAYER = "payer@email.com.br";
    String EMAIL_RECEIVER = "receiver@email.com.br";
    String DOCUMENT_ALL_ZERO = "000.000.000-00";
    BigDecimal BALANCE_HUNDRED = valueOf(100);
    BigDecimal BALANCE_ZERO = BigDecimal.ZERO;
    UserType USER_TYPE_COMMON = UserType.COMMON;
    UserType USER_TYPE_MERCHANT = UserType.MERCHANT;

    static User.UserBuilder userBuilderDefault() {
        return User.builder()
                .name(NAME)
                .password(PASSWORD)
                .email(EMAIL_PAYER)
                .document(DOCUMENT_ALL_ZERO)
                .balance(BALANCE_HUNDRED)
                .userType(USER_TYPE_COMMON);
    }

    static User commonUser() {
        return userBuilderDefault().build();
    }

    static User commonUserWithNoMoney() {
        return userBuilderDefault()
                .balance(BALANCE_ZERO)
                .build();
    }

    static User merchantUser() {
        return userBuilderDefault()
                .email(EMAIL_RECEIVER)
                .userType(USER_TYPE_MERCHANT)
                .build();
    }
}
