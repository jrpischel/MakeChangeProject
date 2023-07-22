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
					System.err.println("*    Please go ask your mom for more money     *");
					System.err.println("************************************************");
				}
				
			
			
			kb.close();
	}

	private static void makeChange(double price, double cash) {
		double change = cash - price;
		
			if (change != 0) {
				System.out.println("*****************************************");
				System.out.print("*\tYour change is: $ ");
				System.out.printf("%6.2f", change);
				System.out.println("\t*");
			}
			
		int twenty = (int) change / 20; 
			if (twenty == 1) {
				System.out.println("*\t" + twenty + "\tTwenty dollar bill\t*");
			}
			else if (twenty > 1) {
				System.out.println("*\t" + twenty + "\tTwenty dollar bills\t*");
			}
				
			change -= 20 * twenty;
			
		int tens = (int) change / 10; 
			if (tens == 1) {
				System.out.println("*\t" + tens + "\tTen dollar bill\t\t*");
			}
			
			change -= 10 * tens;
			
		int fives = (int) change  / 5;
			if (fives == 1) {
				System.out.println("*\t" + fives + "\tFive dollar bill\t*");
			}
			
			change -= 5 * fives;
			
		int ones = (int) change / 1; 
			if (ones == 1) {
				System.out.println("*\t" + ones + "\tOne dollar bill\t\t*");
			}
			else if (ones > 1) {
				System.out.println("*\t" + ones + "\tOne dollar bills\t*");
			}
			
			change -= 1 * ones;
			
			change = Math.round(change * 100);
			
		int quarters = (int) (change / 25);
			if (quarters == 1) {
				System.out.println("*\t" + quarters + "\tQuarter\t\t\t*");
			}
			else if (quarters > 1) {
				System.out.println("*\t" + quarters + "\tQuarters\t\t*");
			}
			
			change -= 25 * quarters;
			
		int dimes = (int) (change / 10);
			if (dimes == 1) {
				System.out.println("*\t" + dimes + "\tDime\t\t\t*");
			}
			else if (dimes > 1) {
				System.out.println("*\t" + dimes + "\tDimes\t\t\t*");
			}
			
			change -= 10 * dimes;
			
		int nickles = (int) (change / 05);
			if (nickles == 1) {
				System.out.println("*\t" + nickles + "\tNickle\t\t\t*");
			}
			else if (nickles > 1) {
				System.out.println("*\t" + nickles + "\tNickles\t\t*");
			}
			
			change -= 05 * nickles;
			
		int pennies = (int) (change / 01);
			if (pennies == 1) {
				System.out.println("*\t" + pennies + "\tPenny\t\t\t*");
			}
			else if (pennies > 1) {
				System.out.println("*\t" + pennies + "\tPennies\t\t\t*");
			}
			System.out.println("*****************************************");
			
	}		

	private static void exactCash(double price, double cash) {
		if (price == cash) {
			System.out.println("*****************************************");
			System.out.println("*    Customer provided exact change     *");
		}		
	}

	private static boolean insufficentFunds(double price, double cash, boolean enoughMoney) {
		if (price > cash) {
			System.err.println("************************************************");
			System.err.println("*         Insufficient funds provided          *");
			enoughMoney = true;
			return enoughMoney;
		}
		return false;
	}
}
