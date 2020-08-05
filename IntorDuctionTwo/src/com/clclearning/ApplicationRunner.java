package com.clclearning;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/clclearning/spring.xml");
		//Person p = (Person) ctx.getBean("person");
		//p.greetPerson();
		
		int hardness=0,  tensileStrength=0;
		double carbonContent=0.0;
		Scanner in = new Scanner(System.in);
		String input = "";

		System.out.println("Please enter the value of hardness of the steel you want to measure:");
		input = in. nextLine(); hardness = Integer.parseInt(input);

		System.out.println("Please enter the value of carbon content of the steel you want to measure:");
		input = in. nextLine(); carbonContent = Double.parseDouble(input);

		System.out.println("Please enter the value of tensile strength of the steel you want to measure:");
		input = in. nextLine(); tensileStrength = Integer.parseInt(input);
		
		SteelGrading steel = (SteelGrading) ctx.getBean("steel-grading");
		steel.setCarbonContent(carbonContent);
		steel.setHardness(hardness);
		steel.setTensileStrength(tensileStrength);
		
		System.out.println("The grade of the steel for which values you have given is: " + steel.getGrade());
	}

}
