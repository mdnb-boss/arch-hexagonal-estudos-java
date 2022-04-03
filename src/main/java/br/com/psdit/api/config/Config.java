package br.com.psdit.api.config;

import br.com.psdit.api.adapters.outbound.SalvarUsuarioAdapter;
import br.com.psdit.api.application.core.service.SalvarUsuarioService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SalvarUsuarioService salvarUsuarioService(SalvarUsuarioAdapter salvarUSuarioAdapter) {
        return new SalvarUsuarioService(salvarUSuarioAdapter);
    }
}
