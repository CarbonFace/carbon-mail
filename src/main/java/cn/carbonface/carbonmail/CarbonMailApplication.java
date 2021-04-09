package cn.carbonface.carbonmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.oas.annotations.EnableOpenApi;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("cn.carbonface")
@EnableOpenApi
@ComponentScan("cn.carbonface")//it's vital to get other module's spring bean
public class CarbonMailApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarbonMailApplication.class, args);
    }

}
