package challenge.backend.banking.entity;

import lombok.Builder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "CommonUser")
@Builder
public class CommonUser extends User{
    String cpf;
}
