package com.guillemmarti.rockpaperscissors.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Value("${springdoc.swagger-ui.scan-packages}")
    private String packageName;
    @Value("${springdoc.swagger-ui.display.title}")
    private String title;
    @Value("${springdoc.swagger-ui.display.description}")
    private String description;
    @Value("${springdoc.swagger-ui.display.contact-name}")
    private String contactName;
    @Value("${springdoc.swagger-ui.display.version}")
    private String version;

    @Bean
    public OpenAPI openAPIInfo() {
        return new OpenAPI().info(new Info().title(title).description(description).version(version)
                .contact(new Contact().name(contactName))
                .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

}
