package challenge.backend.banking.services;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PasswordEncoder {
    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    public static String passwordEncoder(final String password){
        return encoder.encode(password);
    }

    public static Boolean passwordAuthentication(final String password, final String encodedPassword){
        return encoder.matches(password, encodedPassword);
    }
}
