package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder; 

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().antMatchers("/balance").authenticated().antMatchers("/statement").authenticated()
				.antMatchers("/loan").authenticated().antMatchers("/home").permitAll().antMatchers("/contact")
				.permitAll().and().formLogin().and().httpBasic();

	}

	@Override	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("Santosh").password("Santosh123").authorities("Admin").and()
				.withUser("Bikkad").password("Bikkad@123").authorities("DataEntryOperator").and().withUser("BikkadIT")
				.password("BikkadIT@123").authorities("Trainer").and()
				.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}
}

