package com.geovane.spring_security_jwt_api.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.tags.Tag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Spring Security JWT API")
                        .version("1.0")
                        .description("REST API built with Java and Spring Boot featuring stateless authentication using JWT tokens and role-based authorization.")
                        .contact(new Contact()
                                .name("Geovane")
                                .email("geovanegsfarias@gmail.com"))
                )
                .addTagsItem(new Tag().name("Authentication"))
                .addTagsItem(new Tag().name("User"))
                .addSecurityItem(new SecurityRequirement()
                        .addList("Basic Auth")
                        .addList("Bearer Authentication"))
                .components(new Components()
                        .addSecuritySchemes("Basic Auth", new SecurityScheme()
                                .name("Basic Auth")
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("basic"))
                        .addSecuritySchemes("Bearer Authentication", new SecurityScheme()
                                .name("Bearer Authentication")
                                .type(SecurityScheme.Type.HTTP)
                                .scheme("bearer")
                                .bearerFormat("JWT")
                        ));
    }

}