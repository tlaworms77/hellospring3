package com.douzone.hellospring.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.douzone.hellospring.config.WebConfig;

public class HellospringWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected String[] getServletMappings() {
		/*
		 * web.xml의 servlet-mapping작업
		 *  <servlet-mapping>
				<servlet-name>spring</servlet-name>
				<url-pattern>/</url-pattern>
			</servlet-mapping>
		*/
		return new String[] {"/"};
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { WebConfig.class }; // 와일드 제너릭
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}


}
