package challenge.backend.banking.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommonUser extends MongoRepository<CommonUser, String> {
}
