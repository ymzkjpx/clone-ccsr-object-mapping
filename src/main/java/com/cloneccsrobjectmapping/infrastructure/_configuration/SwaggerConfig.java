package com.cloneccsrobjectmapping.infrastructure._configuration;

import com.google.common.base.Predicate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket newsApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(patterns()).build()
                .apiInfo(apiInfo())
                .groupName("clone-ccsr")
                .directModelSubstitute(LocalDateTime.class, java.util.Date.class)
                .directModelSubstitute(LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(LocalTime.class, String.class)
                ;
    }

    public Predicate<String> patterns(){
        return or(regex("/api.*"));
    }

    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("ハーブ栽培キット API仕様")
                .description("version 1.0")
                .build();
    }
}
