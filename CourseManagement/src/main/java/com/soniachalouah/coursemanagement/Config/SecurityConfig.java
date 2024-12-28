package com.soniachalouah.coursemanagement.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .requestMatchers("/api/**").permitAll()  // Utiliser requestMatchers à la place de antMatchers
                .anyRequest().permitAll()  // Permettre l'accès à toutes les autres requêtes
                .and()
                .csrf().disable();  // Désactiver CSRF si nécessaire
        return http.build();
    }
}
