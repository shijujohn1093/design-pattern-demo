package com.thengara.dp.factory;

import java.util.Scanner;

public class TestFactory {

	public static void main(String[] args) {
		PlanFactory planFactory = new PlanFactory();

		while (true) {
			System.out.println("1. COMMERCIALPLAN");
			System.out.println("2. DOMESTICPLAN");
			System.out.println("3. INSTITUTIONALPLAN");
			System.out.println("Enter plan name  :");
			Scanner scanner = new Scanner(System.in);
			String planName = scanner.nextLine();
			System.out.println("Enter number of units : ");
			Plan plan = planFactory.getPlan(planName);
			String units = scanner.nextLine();
			System.out.println(planName + "==========" + units);
			System.out.println(planName + "---- >" + plan.calculateBill(Integer.parseInt(units)));
			System.out.println("Do you want to continue. press [Y] : ");
			String inits = scanner.nextLine();
			if (inits.contentEquals("Y") || inits.contentEquals("YES")) {
				break;
			}
		}

	}

}
