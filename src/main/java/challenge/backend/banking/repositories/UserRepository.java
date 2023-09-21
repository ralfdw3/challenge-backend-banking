package challenge.backend.banking.repositories;

import challenge.backend.banking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
