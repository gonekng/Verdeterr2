package com.board.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class fileConfiguration implements WebMvcConfigurer {
	 
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("file:/**")
                .addResourceLocations("jar:file:/**");
    }
	/*
	 * file:/C:/Users/human/.gradle/caches/블라블라/jython-2.7.2.jar
	 * jar:file:/C:/Users/human/.gradle/caches/블라블라/jython-2.7.2.jar
	 */

}