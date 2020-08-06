package com.clc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiStarter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		// create the IOC container
		String[] beans = new String[] { "com/clc/resources/car.xml", "com/clc/resources/engine.xml" };
		ApplicationContext ctx = new ClassPathXmlApplicationContext(beans);
		
		// work with the IOC
		Car car = (Car) ctx.getBean("c");
		Engine e = (Engine) ctx.getBean("e");
		car.setEngine(e);
		
		//set values
//		e.setModelYear("2019");
//		car.setCarName("Maersk");
		
		// test the application
		car.semaJina();
	}

}
