package atividade.grupo.projeto_em_grupo.configs;

import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@Configuration
@OpenAPIDefinition(
    info = @Info(
        title = "teste API",
        version = "1.0",
        description = "API para o sistema"
    )
)
public class Swagger {

}
