package com.ckael.portfolio.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean 
	SecurityFilterChain filter(HttpSecurity http) throws Exception
	{
//		http.authorizeRequests().anyRequest()
//		.permitAll().and()
//		.csrf().disable().headers().frameOptions().disable();
		return http.build();
	}

}
