package com.clclearning;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiStarter {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/clclearning/resources/beans.xml");
		Farmer f1 = (Farmer) ctx.getBean("f1");
		Farmer f2 = (Farmer) ctx.getBean("f2");
		Farmer f3 = (Farmer) ctx.getBean("f3");
		
		List<Farmer> f = new ArrayList<Farmer>();
		f.add(f1);f.add(f2);f.add(f3);
		for(Farmer farmer: f) {
			farmer.nipeJibuLangu();
		}
	}

}
