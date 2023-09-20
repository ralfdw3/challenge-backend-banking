package challenge.backend.banking.repository;

import challenge.backend.banking.entity.Merchant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MerchantRepository extends MongoRepository<Merchant, String> {
}
