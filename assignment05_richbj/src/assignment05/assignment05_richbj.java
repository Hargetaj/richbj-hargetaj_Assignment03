/***************************************************
 * Name: Bruce Rich
 * 
 * CLass number and section: IT1090C 001
 * 
 * Assignment: Assignment_05
 * 
 * Due Date: 10/26/2017
 * 
 * *Description:  This program will create an array list to organize some of the rides at King's Island.
 * 
 * Citation: Cay Horstman, "Big Java Late Projects". Riduidel, "StackOverflow.com"
 * 
 * Anything else:
 **************************************************/
package assignment05;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class assignment05_richbj
{

	public static void main(String[] args)
	{
		//Importing new Scanner and creating the array list "rides"	
		Scanner in = new Scanner (System.in);
		ArrayList<String> rides = new ArrayList<String>();
		
		//adding 4 rides to the array list rides
		rides.add("Mystic Timbers");
		rides.add("Drop zone");
		rides.add("Flight of Fear");
		rides.add("Delirium");
		
		//printing out the initial state of rides
		System.out.println("The current state of the Array List 'rides' is: \n" + rides);
		
		//asking the user to input 4 more rides to the array list
		//for testing, the four rides that I used were Vortex, Monster, Diamondback, and Vicking Fury.
		System.out.println("\n Please add four more rides to the list");
		
		//this loop reads the next four inputs from the users and adds them to the array list
		for (int i = rides.size() ; i < 8; i++)
		{
			String input = in.nextLine();
			rides.add(input);
		}
		//this print statement shows the updated array list
		System.out.println("Now the current state of the Array List rides is: \n" + rides);
		
		//this sorts the array list alphabetically without case sensativity
		Collections.sort(rides, String.CASE_INSENSITIVE_ORDER);
		//finally this print statement prints the final version of the array list
		System.out.println("\n The final version of the Array List rides is sorted alphabeticaly: \n" + rides);
		
		
	}

}
