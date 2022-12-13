package com.cybage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	public void configure(AuthenticationManagerBuilder auth) throws Exception
	{
		
		//1
		// for single user
//		auth.inMemoryAuthentication().withUser("kishor").password("chicku").roles("USER");

		//1
		//for multiple users
//		auth.inMemoryAuthentication().withUser("kishor").password("chicku").roles("USER").and().withUser("chicku").password("kishor").roles("USER");
		
		
		//2
//		auth.inMemoryAuthentication()
//		.passwordEncoder(passwordEncoder())
//		.withUser("Jhon")
//		.password(passwordEncoder()
//		.encode("Jhon12"))
//		.roles("User");

		//3
		auth.inMemoryAuthentication().passwordEncoder(passwordEncoder()).withUser("jhon")
		.password(passwordEncoder().encode("jhonn")).roles("USER").and().withUser("kishor")
		.password(passwordEncoder().encode("kishor")).roles("ADMIN");

		

		
	}

	
	//2
	private PasswordEncoder passwordEncoder() {
		// TODO Auto-generated method stub
		return new BCryptPasswordEncoder();
	}
	
	
	//3
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http.httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/hello").hasAnyRole("USER","ADMIN")
		.antMatchers("/admin").hasAnyRole("ADMIN");
	}

		
	}

// 1
//	@Bean
//	public PasswordEncoder getPasswordEncoder()
//	{
//		return NoOpPasswordEncoder.getInstance();
//	}
	

