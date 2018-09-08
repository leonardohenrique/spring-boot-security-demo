package com.example.securitydemo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception { // @formatter:off
		http
			.authorizeRequests()
				.antMatchers(HttpMethod.GET, "/").permitAll()		
				.anyRequest().authenticated()			
		.and()
			.formLogin().permitAll()
			.defaultSuccessUrl("/users/me");
	} // @formatter:on

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception { // @formatter:off
		auth
			.inMemoryAuthentication()
				.withUser("admin").password("{noop}admin").roles("ADMIN")
			.and()
				.withUser("user").password("{noop}user").roles("USER");
	} // @formatter:on
}
