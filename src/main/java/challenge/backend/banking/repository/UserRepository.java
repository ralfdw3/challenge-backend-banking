package challenge.backend.banking.repository;

import challenge.backend.banking.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
