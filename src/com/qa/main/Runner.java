package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Coins use = new Coins();
		
		float cost = 14.58f;
		float ammount = 90.00f;
		
		use.transaction(cost, ammount);

	}

}
