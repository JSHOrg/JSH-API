package com.amdocs.jshapi.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;

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
			.authorizeRequests()
			 .antMatchers("/", "/oauth/token" ).permitAll()
			    .anyRequest().authenticated();
				/* .antMatchers(HttpMethod.GET, "/api/**")
					.hasAnyAuthority("ADMIN", "PROCURADOR", "LOGISTICA", "BENEFACTOR", "ALIADO", "TRABAJADOR")
				 .antMatchers(HttpMethod.POST, "/api/**")
				 	.hasAnyAuthority("ADMIN", "PROCURADOR", "LOGISTICA", "BENEFACTOR", "ALIADO", "TRABAJADOR")
				 .antMatchers(HttpMethod.PUT, "/api/**")
				 	.hasAnyAuthority("ADMIN", "PROCURADOR", "LOGISTICA", "BENEFACTOR", "ALIADO", "TRABAJADOR")
				 .antMatchers(HttpMethod.DELETE, "/api/**")
				 	.hasAnyAuthority("ADMIN", "PROCURADOR", "LOGISTICA", "BENEFACTOR", "ALIADO", "TRABAJADOR");*/
		
	}
	
}
