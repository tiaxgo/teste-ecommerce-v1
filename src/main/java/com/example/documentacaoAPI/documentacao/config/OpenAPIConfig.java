package com.example.documentacaoAPI.documentacao.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API Integração com DB e BE")
                        .version("1.0.0")
                        .description("API para comunicação ECOMMERCE. Feita para gerenciar PRODUTOS, com Endpoints de CRUD.")
                );
    }
}
