package br.com.alessander.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CustomerTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("br.com.alessander.spring");
		appContext.refresh();
		
		CustomerService customerService = (CustomerService) appContext.getBean("customerService");
		customerService.test();
		
		appContext.close();
	}
}
