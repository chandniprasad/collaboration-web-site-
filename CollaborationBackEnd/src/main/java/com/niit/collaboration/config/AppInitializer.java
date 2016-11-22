package com.niit.collaboration.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//web.xml-java based configuration
public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class[] getRootConfigClasses(){
		return new Class[] {AppConfig.class, WebSocketConfig.class};
	}
	
	@Override
	protected Class[] getServletConfigClasses(){
		return new Class[] {AppConfig.class, WebSocketConfig.class};
	}
	
	@Override
	protected String[] getServletMappings(){
		return new String[]{"/"};
	}}



