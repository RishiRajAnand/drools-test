package com.javainuse.main;

import org.drools.core.RuleBase;
import org.drools.core.RuleBaseFactory;
import org.drools.core.WorkingMemory;

import com.javainuse.model.Product;

public class DroolsTest {

	public static void main(String[] args) {
		DroolsTest droolsTest = new DroolsTest();
		droolsTest.executeDrools();
	}

	public void executeDrools() {

		Util u = new Util();
		RuleBase ruleBase = RuleBaseFactory.newRuleBase();
		ruleBase.addPackage(u.aPackage);
		WorkingMemory workingMemory = ruleBase.newStatefulSession();

		Product product = new Product();
		product.setType("diamond");

		workingMemory.insert(product);
		workingMemory.fireAllRules();

		System.out.println("The discount for the product " + product.getType()
				+ " is " + product.getDiscount());
	}

}
