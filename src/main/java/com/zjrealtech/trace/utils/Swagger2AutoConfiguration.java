package com.zjrealtech.trace.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>ClassName:     Swagger2
 * <p>Description:   Swagger2配置bean
 */
@Configuration
@EnableSwagger2
public class Swagger2AutoConfiguration {

    @Value(value = "${swagger.package}")
    private String swaggerPackage;

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage(swaggerPackage))
                .paths(PathSelectors.any())
                .build();
    }

    @SuppressWarnings("deprecation")
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Realtech APS RESTful APIs")
                .description("浙江力太科技有限公司 追溯产品 接口文档")
                .termsOfServiceUrl("http://www.zjrealtech.com/")
                .contact("Chenrui")
                .version("1.0")
                .build();
    }
}
