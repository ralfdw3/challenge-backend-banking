package challenge.backend.banking.services;

import challenge.backend.banking.entities.User;
import challenge.backend.banking.entities.inputs.UserInput;
import challenge.backend.banking.entities.outputs.UserOutput;
import challenge.backend.banking.exceptions.NotFoundException;
import challenge.backend.banking.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static challenge.backend.banking.services.PasswordEncoder.passwordEncoder;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findUserById(Long id){
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException("Id inválido: usuário não encontrado"));
    }
    public UserOutput createUser(UserInput userInput) {
        User user = buildUser(userInput);
        userRepository.save(user);
        return buildUserOutput(user);
    }

    private static UserOutput buildUserOutput(User user) {
        return UserOutput.builder()
                .id(user.getId())
                .name(user.getName())
                .build();
    }

    private static User buildUser(UserInput userInput) {
        return User.builder()
                .name(userInput.name())
                .email(userInput.email())
                .password(passwordEncoder(userInput.password()))
                .document(userInput.document())
                .balance(userInput.balance())
                .userType(userInput.userType())
                .build();
    }
}
