/*1. High-Low Game:	Write a program the plays the high-low game with the user. Have the program generate a random number between 1 and 100.
					In a loop, have the user guess the number. Let the user know if their guess is correct. Otherwise, tell them if their
					guess is too low or too high.
					Tell them how many guesses it took to guess the number.
*/
					
package variables_and_conditionals;

import java.util.Random;
import java.util.Scanner;

public class HighLow 
{

    public static void main(String[] args) 
    {
    	// loop
   
    	
    	Random rand = new Random();
    	int answer = rand.nextInt(100);
    	
    	System.out.println("I'm thinking of a number between 1 and 50. Guess what it is.");
    	
    	Scanner input = new Scanner(System.in);
        while(input.hasNextLine()) System.out.println(input.nextLine());
    	int number = Integer.parseInt("" + input);
        
    	int test = number - answer;	
    	
        if(test == 0)    	// if number - answer = 0 congratulations
        {
        	System.out.println("Correct");
        }
        if(test > 0)    	// if number - answer = positive
        {
        	System.out.println("Too High");
        }
        if(test < 0)    	// if number - answer = negative
        {
        	System.out.println("Too Low");
        }
    	
    }

	
	
	
}
