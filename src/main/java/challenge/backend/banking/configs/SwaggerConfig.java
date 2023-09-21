package challenge.backend.banking.configs;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI().info(new Info().title("Challenge Backend Banking")
                .description("")
                .contact(new Contact().name("Ralf Drehmer Wink")
                        .url("http://github.com/ralfdw3"))
                .version("1.0.0")
                .license(new License())
                .termsOfService(""));
    }
}
