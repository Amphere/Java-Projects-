/******************************************************************************
* Textbook: Building Java Programs, A Back to Basics Approach
*  Edition: 3rd
*  Authors: Stuart Reges and Marty Stepp
*  
* Assigned Project: 5B
*
*
*  Class Name: CS 210
* Super Class: Object (Implicit)
*  Implements: None
*
*
* Programmer: Matthew Nguyen
*
* Revision     Date                        Release Comment
* --------  ----------  ------------------------------------------------------
*   1.0     05/07/2017  Initial Release
*
*
* File Description
* ----------------
* This file defines the the class "pascalstriangle", which includes all methods,
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
* Keyboard  user integer input 
*
* 
* Program Outputs
* ---------------
*  Device                            Description
* --------  ------------------------------------------------------------------
* Monitor   pascals triangle 
*
* 
* Class Methods
* -------------
*    Name                                    Description
* ----------  ----------------------------------------------------------------
* main        The OS transfers control to this method upon program execution
* 
*
******************************************************************************
*/
// Imported Packages
// -----------------
import java.util.Scanner;

public class pascalstriangle   // "CS210Template" ---> Your Class Name
{
	
	/**************************************************************************
	 * Method: main(String[])
	 * 
	 * Method Description
	 * ------------------
	 * This static method is the entry point to the program.
	 *
	 * This program displays Pascals triangle, showing the ability of the programmer to cleverly use spacing techniques to properly construct the triangle. 
	 * 
	 * Pre-Conditions
	 * --------------
	 * must not be a negative number, as prompted must be a number between 1-12
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
		
	Scanner input = new Scanner (System.in);	
    int rows ;
    
    
    System.out.println("Please enter the number of rows you would like to display 1-12 : ");
    rows = input.nextInt();
    
    
    
    
    
    for (int i=0; i<rows; i++)
    {
    	int math=1;
    	
    	for (int j=1; j<(rows-i); j++)
    	{
    		System.out.print("   ");
    	}
			//calculations 
    	for (int x=0; x<=i; x++ )
    	{
    		System.out.printf("   "+math+"   ");
    		
    		math = math*(i-x) / (x+1);
    		
    		
    	}

    System.out.println();
    System.out.println();
  
    
    
    
    }  
    
    System.out.println();
    // End method: main(String[])
 
   // End Class Definition: **YOUR Class Name**
    
    

	}
}
