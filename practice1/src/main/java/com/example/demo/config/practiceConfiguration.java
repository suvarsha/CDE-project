package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
@Component
@ConfigurationProperties("practice")
public class practiceConfiguration {
	@Value("${authUserName}")
	private String authUsername;
	
	@Value("${authPassword}")
	private String authPassword;
	
	public String getAuthUsername() {
		return authUsername;
	}

	public String getAuthPassword() {
		return authPassword;
	}

}
