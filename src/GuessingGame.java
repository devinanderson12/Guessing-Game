import java.util.Scanner;

/**
 * 
 */

/**
 * @author d.anderson2
 *
 */
public class GuessingGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  /**


		   *


		   * Name: devin anderson


		   * Teacher: Mr. Hardman


		   * Assignment #3 Program #2


		   * Date Last Modified:October 27th,2016


		   *
		   */
		
		
		  Scanner userInput = new Scanner(System.in);
		  String userName;
		  int userAge;
		  
		  System.out.print("Hey, what's your name? (Sorry, I keep forgetting.)  ");
		  userName = userInput.nextLine();
		  
		  System.out.print("ok," + userName + " how old are you? ");
		  userAge = userInput.nextInt();
		  
		  if (userAge <=15) {
			  System.out.println("You cant drive");
		  } else if (userAge >=16) 
		    if (userAge <=17) { 
			  System.out.println("You can drive, but you cant vote");
		  } else if (userAge >=18)
			if (userAge <=24) {
				System.out.println("You can vote, but not rent a car");
		  
		  } else if (userAge >=24){
			  System.out.println("You can do anything DUDE!");
		  }
			
			  
		
	
	


	
	}

}