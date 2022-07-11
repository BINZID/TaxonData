package org.big;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableSwagger2Doc
@EnableEurekaClient    // 注册
@EnableDiscoveryClient // 对外开放接口
public class TaxonDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(TaxonDataApplication.class, args);
    }

}


