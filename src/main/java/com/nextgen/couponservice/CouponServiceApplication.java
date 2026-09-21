package com.nextgen.couponservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "${app.openapi.title}",
                description = "${app.openapi.description}",
                version = "${app.openapi.version}"
        )
)
@SpringBootApplication
public class CouponServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CouponServiceApplication.class, args);
    }

}
