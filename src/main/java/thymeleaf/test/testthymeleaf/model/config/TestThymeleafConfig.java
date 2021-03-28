package thymeleaf.test.testthymeleaf.model.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;

@Configuration
public class TestThymeleafConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
   // setting up encoder for the application
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new Pbkdf2PasswordEncoder();
    }


}
