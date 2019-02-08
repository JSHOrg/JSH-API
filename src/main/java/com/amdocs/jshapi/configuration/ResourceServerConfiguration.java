package com.amdocs.jshapi.configuration;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

/**
 * OAuth2 Resource server configuration
 * 
 * @author Seiferson (Cuauhtemoc Herrera)
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter{

	@Override
	public void configure(ResourceServerSecurityConfigurer resources) {
		resources.resourceId("restapi");
	}
	
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http
		.cors().and()
			.authorizeRequests()
			.antMatchers("/", "/oauth/token").permitAll()
			 //.anyRequest().authenticated()
			 	.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
	          ;
			   /* .anyRequest().authenticated() 
			    .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
				  .antMatchers(HttpMethod.GET, "/api/**")
					.hasAnyAuthority("ADMIN", "PROCURADOR", "LOGISTICA", "BENEFACTOR", "ALIADO", "TRABAJADOR")
				 .antMatchers(HttpMethod.POST, "/api/**")
				 	.hasAnyAuthority("ADMIN", "PROCURADOR", "LOGISTICA", "BENEFACTOR", "ALIADO", "TRABAJADOR")
				 .antMatchers(HttpMethod.PUT, "/api/**")
				 	.hasAnyAuthority("ADMIN", "PROCURADOR", "LOGISTICA", "BENEFACTOR", "ALIADO", "TRABAJADOR")
				 .antMatchers(HttpMethod.DELETE, "/api/**")
				 	.hasAnyAuthority("ADMIN", "PROCURADOR", "LOGISTICA", "BENEFACTOR", "ALIADO", "TRABAJADOR");
		*/
	 
	
    }
	
}
