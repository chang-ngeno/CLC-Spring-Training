package com.clclearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiStarter {

	@SuppressWarnings("resource")
	public static void main(String [] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/clclearning/beans.xml");
		Farmer f = (Farmer) ctx.getBean("farmer");
		f.setAnimalAge(10);
		f.setAnimalName("Chicken");
		f.setFarmerName("Mkulima Mkenya");
		f.nijibuVizuri();
	}

}
