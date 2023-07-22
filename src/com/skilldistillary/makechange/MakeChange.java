package com.skilldistillary.makechange;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
			Scanner kb = new Scanner(System.in);
			
			double price, cash;
			boolean enoughMoney = false;
			
			System.out.println("What is the price of the item? ");
			price = kb.nextDouble();
			
			System.out.println("How much money did the customer give you? ");
			cash = kb.nextDouble();
			
			boolean keepGoing = insufficentFunds(price, cash, enoughMoney);
				if (keepGoing == false) {
					exactCash(price, cash);
					makeChange(price, cash);
				}
				else {
					System.out.println("Please go ask your mom for more money:");
				}
				
			
			
			kb.close();
	}

	private static void makeChange(double price, double cash) {
		double change = cash - price;
			if (change != 0) {
				System.out.println("Your change is:");
			}
		int twenty = (int) change / 20; 
			if (twenty != 0) {
				System.out.println(twenty + " Twenty(ies)");
			}
			change -= 20 * twenty;
		int tens = (int) change / 10; 
			if (tens != 0) {
				System.out.println(tens + " Ten(s)");
			}
			change -= 10 * tens;
		int fives = (int) change  / 5;
			if (fives != 0) {
				System.out.println(fives + " Five(s)");
			}
			change -= 5 * fives;
		int ones = (int) change / 1; 
			if (ones != 0) {
				System.out.println(ones + " One(s)");
			}
			change -= 1 * ones;
		int quarters = (int) (change / .25);
			if (quarters != 0) {
				System.out.println(quarters + " Quarter(s)");
			}
			change -= .25 * quarters;
		int dimes = (int) (change / .10);
			if (dimes != 0) {
				System.out.println(dimes + " Dime(s)");
			}
			change -= .1 * dimes;
		int nickles = (int) (change / .05);
			if (nickles != 0) {
				System.out.println(nickles + " Nickle(s)");
			}
			change -= .05 * nickles;
		int pennies = (int) Math.round((change / .01));
			if (pennies != 0) {
				System.out.println(pennies + " Penny(ies)");
			}
	}		

	private static void exactCash(double price, double cash) {
		if (price == cash) {
			System.out.println("Customer provided exact change: ");
		}		
	}

	private static boolean insufficentFunds(double price, double cash, boolean enoughMoney) {
		if (price > cash) {
			System.out.println("Insufficient funds provided, please try again:");
			enoughMoney = true;
			return enoughMoney;
		}
		return false;
	}
}
