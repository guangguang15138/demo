package com.example.aoplog.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {


    /**
     *
     * http://localhost:8080/swagger-ui.html     原路径
     * http://localhost:8080/doc.html     原路径
     * 配置swagger2核心配置 docket
     */
    @Bean
    public Docket createRestApi() {
        // 指定api类型为swagger2  // 用于定义api文档汇总信息
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // 指定controller包  // 所有controller
                .apis(RequestHandlerSelectors
                        .basePackage("com.example"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        // 文档页标题 // 联系人信息// 详细信息 // 网站地址  // 文档版本号
        return new ApiInfoBuilder()
                .title("swagger-api")
                .description("api文档")
                .version("1.0.0")
                .build();
    }
}