package challenge.backend.banking.services;

import challenge.backend.banking.entities.User;
import challenge.backend.banking.exceptions.NotFoundException;
import challenge.backend.banking.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static challenge.backend.banking.stubs.UserStub.commonUser;
import static java.util.Optional.ofNullable;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {
    @InjectMocks
    private UserService userService;
    @Mock
    private UserRepository userRepository;

    @Test
    void should_returnOk_when_findingUser() {
        when(userRepository.findById(1L)).thenReturn(ofNullable(commonUser()));

        User user = userService.findUserById(1L);

        assertEquals(commonUser(), user);
    }

    @Test
    void should_throwNotFoundException_when_findingInvalidUser() {
        assertThrows(NotFoundException.class, () -> userService.findUserById(null));
    }
}