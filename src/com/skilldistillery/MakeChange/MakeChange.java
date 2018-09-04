package com.skilldistillery.MakeChange;


	import java.util.Scanner;
	import java.lang.Math;


	public class MakeChange{


		public static void main(String[] args) {

		    // get input from cashier    

		    Scanner input = new Scanner(System.in);

		    

		    double price, cash; // initialize input variables

		    double cashowed, amount, cashleft; 

		    double totalPrice = 0; 	

		    int pennies, nickels, dimes, quarters, ones, fives, tens, twenties; // initialize calculation variables

		    

		    // CONSTANT VARIABLES

		        double penniesReturned = .01;

		        double nickelsReturned = .05;

		        double dimesReturned = .1;

		        double quartersReturned = .25;

		        double dollarsReturned = 1;

		        double fivesReturned = 5;

		        double tensReturned = 10;

		        double twentiesReturned = 20;

		        

		        

		    // prompt cashier for input and read price from user

		    System.out.print("Enter item price or 0 to quit: ");

		    price = input.nextDouble();

		    totalPrice = totalPrice + price;

		   

		    // loop until sentinel value read from user

		    while ( price != 0)

		    {        

		        // prompt for input and read next price from cashier

		        System.out.print("Enter additional item price or 0 to total: ");

		        price = input.nextDouble();

		        totalPrice = totalPrice + price;

//		        System.out.println(totalPrice + "-testing-");

		        

		        

		    }

		        

		        // Display item total and cash total

		        System.out.printf("ITEM TOTAL: %.2f%n", totalPrice);

		     

		        

		        // Prompt cashier to enter cash given by customer

		        System.out.print("\n" + "Enter amount of cash given: ");

		        cash = input.nextDouble();

		        

		        while (cash < totalPrice) {

		        	System.out.println("Incorrect cash total. " + cash + " Please enter sufficient cash.");

		        	cash = cash + input.nextDouble();

		        	System.out.println("Cash paid:  " + cash);

		        }

		        

		        

		        // Tell cashier the amount to give back to customer

		        cashowed = cash - totalPrice;

		        System.out.printf("\n" + "CHANGE OWED: %.2f%n", cashowed);

		        

		        // Display amount of each bill to give back in change



		        twenties = (int) Math.floor(cashowed/twentiesReturned);

		        tens = (int) Math.floor((cashowed - twenties * twentiesReturned)/tensReturned);

		        fives = (int) Math.floor((cashowed-twenties * twentiesReturned - tens * tensReturned)/fivesReturned);

		        ones = (int) Math.floor((cashowed - twenties * twentiesReturned - tens * tensReturned - fives * fivesReturned));



		        cashleft = cashowed - twenties * twentiesReturned - tens * tensReturned - fives * fivesReturned - ones * dollarsReturned;

		        

		        // correct incorrect decimal of .999999

		        cashleft = Math.round(cashleft * 100.0) /100.0;

		        

		        quarters =  (int) Math.floor(cashleft/.25);

		        

		        cashleft = cashowed - twenties * twentiesReturned - tens * tensReturned - fives * fivesReturned - ones * dollarsReturned - quarters * quartersReturned;

		        

		        // correct incorrect decimal of .999999

		        cashleft = Math.round(cashleft * 100.0) /100.0;

		        

		        dimes =  (int) Math.floor(cashleft/dimesReturned);

		        

		        cashleft = cashowed - twenties * twentiesReturned - tens * tensReturned - fives * fivesReturned - ones * dollarsReturned - quarters * quartersReturned - dimes * dimesReturned;

		        

		        // correct incorrect decimal of .999999

		        cashleft = Math.round(cashleft * 100.0) /100.0;

		        

		        nickels =  (int) Math.floor(cashleft/nickelsReturned);

		        cashleft = cashowed - twenties * twentiesReturned - tens * tensReturned - fives * fivesReturned - ones * dollarsReturned - quarters * quartersReturned - dimes * dimesReturned - nickels * nickelsReturned;

		        

		        // correct incorrect decimal of .999999

		        cashleft = Math.round(cashleft * 100.0) /100.0;

		        

		        pennies =  (int) Math.floor(cashleft/penniesReturned);

		        

		    // Print correct change to give back

		    if (twenties > 0)

		    {

		        System.out.print("$20.00: " + twenties + "\n");

		    }

		        

		    if (tens > 0)

		    {

		        System.out.print("$10.00: " + tens + "\n");

		    }

		        

		    if (fives > 0)

		    {

		        System.out.print("$5.00: " + fives + "\n");

		    }    

		    

		    if (ones > 0)

		    {

		        System.out.print("1.00: " + ones + "\n");

		    }    

		    

		    if (quarters > 0)

		    {

		        System.out.print("$0.25: " + quarters + "\n");

		    }    

		        

		    if (dimes > 0)

		    {

		        System.out.print("$0.10: " + dimes + "\n");

		    }

		        

		    if (nickels > 0)

		    {

		        System.out.print("$0.05: " + nickels + "\n");

		    }

		        

		    if (pennies > 0)

		    {

		        System.out.print("$0.01: " + pennies + "\n");

		    }

		    

		        System.out.println("----------------------");

		        System.out.println("***Thank you, come again!***");

		        

		} 

}
