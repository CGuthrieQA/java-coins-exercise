package com.qa.main;

public class Coins {
	
	// verbose subtraction accounting for rounding errors
	public float subtraction(float cost, float ammount) {
		
		// whole number remainder
		float toWhole= (int) (ammount - cost);
		
		// decimal remainder to round
		float toRound = (ammount - cost - toWhole) * 100;
		
		// rounded remainder
		float toDouble = (float) Math.round(toRound) / 100;
		
		return toWhole + toDouble;
	}
	
	// use modulus to go through and try to find remainders
	public String division(float input) {
		
		// set a mutable variable from input
		float changeLeft = input;
		
		// create a mutable stringe to print at the end
		String listChange = "";
		
		// array of all change types to loop through
		float[] changeArray = { 50.00f, 20.00f, 10.00f, 5.00f, 2.00f, 1.00f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };
			
		// loop through the change types
		for (int i = 0; i < changeArray.length; i++) {
			
			// if the division of how much you have by the size of the change amount is 1 or more
			if (changeLeft / changeArray[i] >= 1.0) {
				
				// add to the string of change (setting to int to remove decimal places)
				listChange = listChange + (int)(changeLeft / changeArray[i]) + " £" + changeArray[i] + " change\r\n";
				
				// the change left is equal to 
				//the change left minus 
				// the value of current change amount multiplied by
				//the integer version of the change left minus current change ammount
				changeLeft = changeLeft - (int)(changeLeft / changeArray[i]) * changeArray[i];
				
			}
		}
		
		// return a list of the change
		return listChange;
		
	}
	
	// run all the stuff in coins
	public void transaction(float cost, float ammount) {
		
		float calcMoney = subtraction(cost, ammount);
		
		String changeList = division(calcMoney);
		
		System.out.println("Cost: " + cost + "\r\nAmmount: " + ammount + "\r\nChange:\r\n" + changeList);
		
	}
	

}
