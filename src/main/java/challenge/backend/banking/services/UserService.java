package challenge.backend.banking.services;

import challenge.backend.banking.entities.User;
import challenge.backend.banking.exceptions.NotFoundException;
import challenge.backend.banking.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User findUserById(Long id){
        return userRepository.findById(id).orElseThrow(() -> new NotFoundException("Id inválido: usuário não encontrado"));
    }
}
