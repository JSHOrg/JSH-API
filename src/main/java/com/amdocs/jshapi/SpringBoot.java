package com.amdocs.jshapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.amdocs.jshapi.configuration.CustomPropertiesConfiguration;


/**
 * Spring boot main class
 * 
 * @author Cuauhtemoc Herrera
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableConfigurationProperties(CustomPropertiesConfiguration.class)
public class SpringBoot {

	public static void main( String[] args ) throws Exception {
		SpringApplication.run( SpringBoot.class );
	}

}
