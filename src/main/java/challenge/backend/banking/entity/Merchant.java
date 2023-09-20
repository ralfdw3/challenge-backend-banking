package challenge.backend.banking.entity;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Merchant")
@Builder
public class Merchant extends User{
    String cnpj;
}
