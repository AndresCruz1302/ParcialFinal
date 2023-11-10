package com.Ejemplo.EjemploComunicacion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.HeadersConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.XXssProtectionHeaderWriter;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
             @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, HandlerMappingIntrospector introspector) throws Exception {
        // @formatter:off
        http
                .csrf(AbstractHttpConfigurer::disable)
                .headers(headers -> headers
                        .httpStrictTransportSecurity(hsts -> hsts
                                .includeSubDomains(true)
                                .preload(true)
                                .maxAgeInSeconds(31536000)
                        )
                        .contentTypeOptions(HeadersConfigurer.ContentTypeOptionsConfig::disable)
                        .frameOptions(HeadersConfigurer.FrameOptionsConfig::sameOrigin
                        )
                        .xssProtection(xss -> xss
                                .headerValue(XXssProtectionHeaderWriter.HeaderValue.ENABLED_MODE_BLOCK)
                        )
                        //.contentSecurityPolicy(csp -> csp
                        //        .policyDirectives("default-src 'self';")
                        //)
                )
                .authorizeHttpRequests((authorize) -> authorize
                        //Control access privileges
                        .requestMatchers(new MvcRequestMatcher(introspector, "/Camas")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/Comida")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/opa")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/Juguetes")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/Aseo")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/combos")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readAseo")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readAseo/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/deleteAseo")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/deleteAseo/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/createAseo")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/createAseo/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/updateAseo")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/updateAseo/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readCamas")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readCamas/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/deleteCama")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/deleteCamas/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/createCama")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/updateCama")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/updateCamas/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readCombos")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readCombos/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/deleteCombos")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/deleteCombos/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/createCombos")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/updateCombos")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/updateComboss/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readComida")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readComida/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/deleteComida")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/deleteComida/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/createComida")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/createComida/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/updateComida")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/updateComida/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readJuguetes")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readJuguetes/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/deleteJuguetes")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/deleteJuguetes/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/createJuguetes")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/createJuguetes/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/updateJuguetes")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/updateJuguetes/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readRopa")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/readRopa/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/deleteRopa")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/deleteRopa/{id}")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/createRopa")).authenticated()
                        .requestMatchers(new MvcRequestMatcher(introspector,"/api/updateRopa")).authenticated()

                        .anyRequest().permitAll()
                )
                .formLogin(withDefaults());
        return http.build();
    }
        @Bean

        public PasswordEncoder passwordEncoder() {
            return new BCryptPasswordEncoder();
        }

        @Bean
        public InMemoryUserDetailsManager userDetailsService() {
            PasswordEncoder passwordEncoder = passwordEncoder();
            UserDetails user = User.builder()
                    .username("user")
                    .password(passwordEncoder.encode("Hiañ00F1153.desic°00B0hier"))
                    .roles("USER")
                    .build();
            return new InMemoryUserDetailsManager(user);

        }
}
