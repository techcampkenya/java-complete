package basics;

import java.util.Scanner;

public class Conditional {
	/**
	 * Conditional statements(IF) are used to test one more conditions. 
	 *  IF ELSE (Used when there is 1 decision is to be made among
	 *   2 choices)
	 *  if (condition (boolean))
	 *  {
	 *  	Executes if condition is true
	 *  }
	 *  else
	 *  {
	 *  	Executes if condition is false
	 *  }
	 *  
	 *  IF ELSE IF(Used when there is 1 decision is to be made among 
	 *   more than 2 choices)
	 *   
	 *   if (condition(boolean))
	 *   {
	 *   	Executes if condition is True
	 *   }
	 *   else if(condition(boolean))
	 *   {
	 *   	Executes if condition is True
	 *   }
	 *    else if(condition(boolean))
	 *   {
	 *   	Executes if condition is True
	 *   }
	 *   .
	 *   .
	 *   .
	 *   else
	 *   {
	 *  	Executes if all conditions in the Else If fail
	 *   }
	 *
	 */

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter number one:");
		float number_one = (float) sc1.nextFloat();
		sc1.close();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter number two:");
		float number_two = (float) sc1.nextFloat();
		sc1.close();
		
		if (number_one > number_two)
		{
			System.out.println("Number One is larger");
		}
		else
		{
			System.out.println("Number Two is larger");
		}
	}

}
