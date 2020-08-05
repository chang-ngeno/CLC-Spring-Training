package com.clclearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Members {
	public static void main(String[] args) {
		// read the beans XML
		//Resource r = new ClassPathResource("com/clclearning/spring.xml");
		// load the IOC container
		//BeanFactory factory = new XmlBeanFactory(r);
		@SuppressWarnings("resource")
		ApplicationContext factory = new ClassPathXmlApplicationContext("com/clclearning/spring.xml");
		// create the object
		Hello h = (Hello) factory.getBean("hello");
		Hello h1 = (Hello) factory.getBean("hello");
		Hello h3 = (Hello) factory.getBean("hello");
		h.sayHello();
		System.out.println(h.equals(h1)&&h1.equals(h3));
	}
}
