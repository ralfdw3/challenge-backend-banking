package challenge.backend.banking.enums;

public enum UserType {
    COMMON("COMMON"), MERCHANT("MERCHANT");

    private final String userType;

    UserType(String userType) {
        this.userType = userType;
    }
}
