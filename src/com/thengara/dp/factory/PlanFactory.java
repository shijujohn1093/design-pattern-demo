package com.thengara.dp.factory;

public class PlanFactory {

	public Plan getPlan(String planName) {
		Plan plan = null;
		if (planName == null) {
			plan = null;
		} else if (planName.equals("COMMERCIALPLAN")) {
			plan = new CommercialPlan();
		} else if (planName.equals("DOMESTICPLAN")) {
			plan = new DomesticPlan();
		} else if (planName.equals("INSTITUTIONALPLAN")) {
			plan = new InstitutionalPlan();
		}
		return plan;
	}
}
