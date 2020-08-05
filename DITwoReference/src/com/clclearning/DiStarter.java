package com.clclearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiStarter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/clclearning/resources/beans.xml");
		Farmer f = (Farmer) ctx.getBean("farmer");
		DomesticAnimals d = (DomesticAnimals) ctx.getBean("animals");
		FarmTools ft = (FarmTools) ctx.getBean("tools");
		f.setDomesticAnimal(d);
		f.setFarmTools(ft);
		f.nipeJibuLangu();
	}

}
