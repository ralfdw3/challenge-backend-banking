package challenge.backend.banking.services;

import org.junit.jupiter.api.Test;

import static challenge.backend.banking.services.PasswordEncoder.*;
import static org.junit.jupiter.api.Assertions.*;

class PasswordEncoderTest {
    @Test
    void should_encodeAndMatchTheEncodedPassword() {
        String password = "password";
        String encodedPassword = passwordEncoder(password);
        Boolean isTheSamePassword = passwordAuthentication(password, encodedPassword);

        assertTrue(isTheSamePassword);
    }
}