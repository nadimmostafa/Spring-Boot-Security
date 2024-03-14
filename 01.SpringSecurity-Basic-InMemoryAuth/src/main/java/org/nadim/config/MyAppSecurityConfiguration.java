package org.nadim.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class MyAppSecurityConfiguration {
	
	@Bean
	public UserDetailsService detailsService() {
		UserDetails nadim =User.builder()
		.username("nadim")
		.password("{noop}123")
		.build();
		
		return new InMemoryUserDetailsManager(nadim);
	}
}
