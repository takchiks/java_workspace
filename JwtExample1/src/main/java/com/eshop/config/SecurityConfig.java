package com.eshop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.eshop.service.CustomUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	CustomUserDetailsService customUserDetailsService; 

	@Override
	public void configure(HttpSecurity http) throws Exception {

//				http
////				.csrf()
////				.disable()
////				.cors()
////				.disable()
//				.authorizeRequests()
//				.antMatchers("/message", "/getUser").permitAll()
//				.anyRequest()
//				.authenticated()
//				.and()
//				.httpBasic();
		
		http
		.csrf()
	.disable()
	.cors()
	.disable()
			.authorizeRequests()
			.antMatchers("/token","/wishlist","/product*","/products*","/*").permitAll()
				.anyRequest()
					.authenticated()
						.and()
						.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
	}
	
	@Override
	public void configure(AuthenticationManagerBuilder auth) throws Exception {

//		auth.inMemoryAuthentication().withUser("amit").password(this.passwordEncoder().encode("1234")).roles("NORMAL");
//		auth.inMemoryAuthentication().withUser("anusha").password(this.passwordEncoder().encode("1234")).roles("ADMIN");
		
		auth.userDetailsService(customUserDetailsService).passwordEncoder(this.passwordEncoder());
	
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		
		return NoOpPasswordEncoder.getInstance();
		
	}
	
	@Bean
	public AuthenticationManager getAuthenticationManager() throws Exception {
		return super.authenticationManager();
	}

}
