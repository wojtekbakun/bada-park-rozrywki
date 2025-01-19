package bada.park_rozrywki.park_rozrywki;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExceptionHandlingConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.DefaultSecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;

@Configuration
public class SecurityConfiguration {

    @Bean
    public DefaultSecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers("/", "/index", "/login", "/logout").permitAll()
                        .requestMatchers("/webjars/**").permitAll()
                        .requestMatchers("/resources/static/**", "/resources/static").permitAll()
                        .requestMatchers("/main").authenticated()
                        .requestMatchers("/main_admin").hasRole("ADMIN")
                        .requestMatchers("/bilety_admin").hasRole("ADMIN")
                        .requestMatchers("/bilety_user", "/user/update").hasRole("USER")
                        .requestMatchers("/main_user").hasRole("USER")
                        .requestMatchers("/errors").permitAll()
                        .requestMatchers("/bilety/**").authenticated()
                        .requestMatchers("/pracownicy/**").authenticated()
                        .anyRequest().authenticated()

                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .defaultSuccessUrl("/index", true)
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/index")
                        .permitAll()
                ) ;
        return http.build();
    }

    @Bean
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
        UserDetails user = User.withUsername("user")
                .password(passwordEncoder.encode("user"))
                .roles("USER")
                .build();
        UserDetails admin = User.withUsername("admin")
                .password(passwordEncoder.encode("admin"))
                .roles("ADMIN")
                .build();
        return new InMemoryUserDetailsManager(user, admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    // Custom AuthenticationEntryPoint (Obsługuje błąd 404)
    private AuthenticationEntryPoint customAuthenticationEntryPoint() {
        return (request, response, authException) -> {
            response.sendRedirect("/errors/404");  // Zwraca stronę błędu 404
        };
    }

    // Custom AccessDeniedHandler (Obsługuje błąd 403)
    private AccessDeniedHandler customAccessDeniedHandler() {
        return (request, response, accessDeniedException) -> {
            response.sendRedirect("/errors/403");  // Zwraca stronę błędu 403
        };
    }
}


