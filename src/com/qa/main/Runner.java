package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Coins use = new Coins();
		
		float cost = 4.58f;
		float ammount = 20.00f;
		
		use.transaction(cost, ammount);

	}

}
