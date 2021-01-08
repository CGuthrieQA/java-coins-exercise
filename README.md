# Coins
1. Given a cost and an amount, work out the change given in specific coinage.
For example; the cost is £4.58 and the customer pays with a £20 note so as change they receive:

* 1 £10 note
* 1 £5 note
* 2 20p's
* 1 2p

```java
package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		Coins use = new Coins();
		
		float cost = 4.58f;
		float ammount = 20.00f;
		
		use.transaction(cost, ammount);

	}

}

```

```java
package com.qa.main;

public class Coins {
	
	public float subtraction(float cost, float ammount) {
		
		float toWhole= (int) (ammount - cost);
		float toRound = (ammount - cost - toWhole) * 100;
		float toDouble = (float) Math.round(toRound) / 100;
		
		return toWhole + toDouble;

	}
	
	public String division(float input) {
		
		float changeLeft = input;
		String listChange = "";
		float[] changeArray = { 50.00f, 20.00f, 10.00f, 5.00f, 2.00f, 1.00f, 0.50f, 0.20f, 0.10f, 0.05f, 0.02f, 0.01f };
			
		for (int i = 0; i < changeArray.length; i++) {
			
			if (changeLeft / changeArray[i] >= 1.0) {

				listChange = listChange + (int)(changeLeft / changeArray[i]) + " £" + changeArray[i] + " change\r\n";
				changeLeft = changeLeft - (int)(changeLeft / changeArray[i]) * changeArray[i];
				
			}
		}
		
		return listChange;
		
	}

	public void transaction(float cost, float ammount) {
		
		float calcMoney = subtraction(cost, ammount);
		String changeList = division(calcMoney);
	
		System.out.println("Cost: " + cost + "\r\nAmmount: " + ammount + "\r\nChange:\r\n" + changeList);
		
	}
	

}

```