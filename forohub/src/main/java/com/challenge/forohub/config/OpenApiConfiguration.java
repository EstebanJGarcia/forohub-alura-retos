package com.challenge.forohub.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.security.SecurityScheme.Type;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfiguration {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .components(new Components()
                        .addSecuritySchemes("bearer-key",
                                new SecurityScheme()
                                        .type(Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT"))
                ).info(new Info()
                        .title("ForoHUB")
                        .description("API REST Challenge ForoHub")
                        .contact(new Contact()
                                .name("Esteban J Rios")
                                .email("ejgr1990ar@gmail.com"))
                        .license(new License()
                                .name("MIT")
                                .url("http://forohub.com/api/licencia"))
                );
    }
}
