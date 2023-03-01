package io.github.educandido;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class MinhaConfiguration {

    @Value("${spring.profiles.active}")
    private String profileActive;

    @Bean(name = "applicationName")
    public String applicationName(){
        return "Sistema de Vendas MinhaConfiguration";
    }

    @Bean
    public CommandLineRunner executar(){
        return args -> {
            System.out.println("RODANDO A CONFIGURAÇÃO DE ...".concat(profileActive));
        };
    }
}
