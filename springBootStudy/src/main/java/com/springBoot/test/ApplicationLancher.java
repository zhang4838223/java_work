package com.springBoot.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by xiaojun.zhang on 2016/3/25.
 */
@Configuration//配置控制
@EnableAutoConfiguration//启用自动控制
@ComponentScan//组件扫描
@SpringBootApplication// Spring Boot 应用的标识
@EnableScheduling//job执行
@MapperScan("com.springBoot.test.dao")// mapper 接口类扫描包配置
public class ApplicationLancher extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

    @Value("${port}")
    private int port;

    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
       return builder.sources(ApplicationLancher.class);
    }

        public static void main(String[] args){
        SpringApplication.run(ApplicationLancher.class);
    }

    @Override
    public void customize(ConfigurableEmbeddedServletContainer configurableEmbeddedServletContainer) {
        configurableEmbeddedServletContainer.setPort(port);
    }
}
