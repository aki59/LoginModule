package com.wipro.LoginMod;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.wipro.LoginMod.impl.AppUserDetailsService;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder()
	{
		BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}
	
	@Bean
	@Primary
	public AppUserDetailsService userDetails()
	{
		AppUserDetailsService appUserDetailService=new AppUserDetailsService();
		return appUserDetailService;
	}
	
	
	
	

}
