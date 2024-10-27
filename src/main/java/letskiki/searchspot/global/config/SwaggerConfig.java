package letskiki.searchspot.global.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;
import io.swagger.v3.oas.annotations.servers.Server;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
@RequiredArgsConstructor
@OpenAPIDefinition(info = @Info(title = "SearchSpot REST API", version = "1.0",
        contact = @Contact(name = "sHu", email = "akgkfk3@naver.com")),
		servers = {@Server(url = "http://localhost:8080", description = "로컬 서버")},
        security = {@SecurityRequirement(name = "bearerToken")}
)
@SecuritySchemes({
        @SecurityScheme(name = "bearerToken", type = SecuritySchemeType.HTTP, scheme = "bearer", bearerFormat = "JWT")
})
public class SwaggerConfig {

    @Bean
    GroupedOpenApi common() {
        String [] pathsToMatch = {
                "/api/v1",
        };

        return GroupedOpenApi.builder()
                .group("common")
                .pathsToMatch(pathsToMatch)
                .build();
    }

    @Bean
    GroupedOpenApi user() {
        String [] pathsToMatch = {
                "/api/v1/"
        };

        return GroupedOpenApi.builder()
                .group("user")
                .pathsToMatch(pathsToMatch)
                .build();
    }

    @Bean
    GroupedOpenApi admin() {
        String [] pathsToMatch = {
                "/api/v1/admin/**"
        };

        return GroupedOpenApi.builder()
                .group("admin")
                .pathsToMatch(pathsToMatch)
                .build();
    }
}
