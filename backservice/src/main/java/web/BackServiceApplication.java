package web;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BackServiceApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BackServiceApplication.class).web(true).run(args);
    }
}
