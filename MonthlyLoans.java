/******************************************************************************
* This is a program to calculate the monthly loans 
*
* Textbook: Building Java Programs, A Back to Basics Approach
*  Edition: 3rd
*  Authors: Stuart Reges and Marty Stepp
*
* Assigned Project: 4
*
*
*  Class Name: CS 210 spring 2017
* Super Class: Object (Implicit)
*  Implements: None
*
*
* Programmer: Matthew Nguyen
*
* Revision     Date                        Release Comment
* --------  ----------  ------------------------------------------------------
*   1.0     04/28/2017  Initial Release
*
*
* File Description
* ----------------
* This file defines the the class "YOUR ClassName", which includes all methods,
* variables, and constant values. Specifically, this class contains the Console
* application entry method, main(), which is a static method, since no object
* of the class type is ever instantiated.
*
*
* User Defined Types (UDTs) Utilized
* ----------------------------------
*      Name                               Description
* --------------  -------------------------------------------------------------
*                          **** No UDTs utilized ****
*
*
* Program Inputs
* --------------
*  Device                            Description
* --------  -------------------------------------------------------------------
* Keyboard   None
*
*
* Program Outputs
* ---------------
*  Device                            Description
* --------  ------------------------------------------------------------------
* Monitor   This program displays monthly payments and loan interest
*
*
* Class Methods
* -------------
*    Name                                    Description
* ----------  ----------------------------------------------------------------
* main        The OS transfers control to this method upon program execution
* ** Add name and description of any other Class methods defined in this file **
*
******************************************************************************
*/
// Imported Packages
// -----------------
// None

import java.util.*;
public class MonthlyLoans// "CS210Template" ---> Your Class Name
{

	/**************************************************************************
	 * Method: main(String[])
	 *
	 * Method Description
	 * ------------------
	 * This static method is the entry point to the program.
	 *
	 * This program displays the ability of the programmer to compute and prompt the user questions regarding payment loans
	 * so that this program and compute the amount paid.
	 *
	 *
	 * Pre-Conditions
	 * --------------
	 *
	 * must not input a negative number nor, years must be int numbers.
	 *
	 *
	 * ------------------------------- Arguments ------------------------------
	 *   Type        Name                         Description
	 * --------  ------------  ------------------------------------------------
	 * String[]  args          Array of "string" argument(s) passed to main()
	 *                         when the Console program is invoked by the User.
	 *
	 *
	 *
	 * RETurn
	 *  Type                            Description
	 * ------  ----------------------------------------------------------------
	 * void    No value is RETurned by the method
	 *
	 *
	 * Invoked Class Methods
	 * ---------------------
	 *         Name                              Description
	 * --------------------  --------------------------------------------------
	 *  none
	 *
	 **************************************************************************
	 */
	public static void main(String[] args)
	{
		// Constant "final" Value Declarations

		// Initialized Variable Declarations

		// Uninitialized Variable Declarations

		Scanner console=new Scanner (System.in);

		System.out.println("This program calculates monthly loan payments and mortgage payments.");

		System.out.println("Enter the loan amount  :");
			double loan= console.nextDouble();
				calculate(loan);
	}
	public static void calculate(double loan)
	{
		Scanner console = new Scanner (System.in);

		//Declaring variables

		int StartingNumberOfYears,EndingNumberOfYears,YearIncrement;

		double StartingRate,EndingRate,IntrestRate;

		System.out.println("Enter the starting number of years to repay the loan:");
			StartingNumberOfYears= console.nextInt();

		System.out.println("Enter the ending number of years to repay the loan:");
			EndingNumberOfYears= console.nextInt();

		System.out.println("Enter the years increment between tables:");
			YearIncrement= console.nextInt();

		System.out.println("Enter the starting loan yearly interest rate, %:");
			StartingRate = console.nextDouble();

		System.out.println("Enter the ending loan yearly interest rate, %:");
			EndingRate = console.nextDouble();

		System.out.println("Enter the increment interest rate, %:");
			IntrestRate = console.nextDouble();

			//CALCULATION

		for(int i=StartingNumberOfYears;i<=EndingNumberOfYears; i+=YearIncrement)
		{
			System.out.println("Number Of Years:"+i);
			System.out.println("Intrest rate of monthly payment");

		for(double j=StartingRate; j<=EndingRate; j+=IntrestRate)
		{

			int n = i*12;
			double c = j / 12 / 100;
			double payment = loan * c * Math.pow(1 +c, n) / (Math.pow(1+c, n)-1);

			System.out.printf("payment = $" + "%.2f",(double)payment);
			System.out.println();

		}
		}
	}
}
























	   // End method: main(String[])

   // End Class Definition: **YOUR Class Name**
