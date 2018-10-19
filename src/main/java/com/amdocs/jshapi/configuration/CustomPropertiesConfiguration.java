package com.amdocs.jshapi.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Class used to create and map custom properties for the application
 * 
 * @author Cuauhtemoc Herrera
 */
@ConfigurationProperties("jshapi")
public class CustomPropertiesConfiguration {
	private String clientId;
	private String clientSecret;

	public String getClientId(){
		return this.clientId;
	}

	public void setClientId(String clientId){
		this.clientId = clientId;
	}

	public String getClientSecret(){
		return this.clientSecret;
	}

	public void setClientSecret(String clientSecret){
		this.clientSecret = clientSecret;
	}
}
