package com.manulife.eTransfer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.HttpHeaders;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.OAuthBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Arrays;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-11-06T16:44:34.407+08:00")

@Configuration
public class SwaggerDocumentationConfig {

    private String type = "petstore_auth";//必须和api上的swagger authzacation的value值一致!!!
    private String tokenUrl = "http://localhost:8081/api/v1/oauth/token";

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger ETransfer")
                .description("This is a sample server ETransfer server.  You can find out more about     Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).      For this sample, you can use the api key `special-key` to test the authorization     filters.")
                .license("Apache 2.0")
                .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .contact(new Contact("", "", "apiteam@swagger.io"))
                .build();
    }

    @Bean
    public Docket customImplementation() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.manulife.eTransfer.api"))
                .build()
                .securitySchemes(Arrays.asList(oauth()))
                .directModelSubstitute(org.threeten.bp.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(org.threeten.bp.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    @Bean
    SecurityScheme oauth() {
        return new OAuthBuilder()
                .name(type)
                .grantTypes(grantTypes())
                .scopes(scopes())
                .build();
    }

    private List<GrantType> grantTypes() {
        return Arrays.asList(new ResourceOwnerPasswordCredentialsGrant(tokenUrl));
    }

    List<AuthorizationScope> scopes() {
        AuthorizationScope writeScope = new AuthorizationScope("write:pets", "modify natinality in your account");
        AuthorizationScope readScope = new AuthorizationScope("read:pets", "read your natinality");
        return Arrays.asList(writeScope, readScope);
    }

}
