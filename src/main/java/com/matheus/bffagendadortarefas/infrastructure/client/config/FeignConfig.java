package com.matheus.bffagendadortarefas.infrastructure.client.config;

import com.matheus.bffagendadortarefas.infrastructure.client.config.FeignError;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfig {

    @Bean
    public FeignError feignError(){
        return new FeignError();
    }
}
