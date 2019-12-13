/**
 * 
 */
package com.vd.springbootangular8crud.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author vivedesh
 *
 */
@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().
		disable()
		.authorizeRequests()
		.antMatchers(HttpMethod.OPTIONS, "/**")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.httpBasic();
	}
}
