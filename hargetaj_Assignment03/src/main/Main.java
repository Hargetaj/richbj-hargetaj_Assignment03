/**
*Name: Alex Hargett, Bruce Rich
*Class Number and Section: Programming 2 (002)
*Assignment #: 03
*Due date: 2/1/2018
*Description: This will test BigInteger data values for there Prime-ness
**/
package main;
import java.math.BigInteger;
/**
 * This program will test the prime-ness of BigInteger numbers, and test our method 
 * @author hargetaj
 *
 */
public class Main {
/**
 * This method will be used to call our prime class, then test the result to see if it is correct
 * @param args- this will print our results to the system
 */
	public static void main(String[] args) {
		//here declare a boolean to hold the value if prime or not
		BigIntPrime checkPrime = new BigIntPrime();
		
		//Now we will test the results to see if they are accurate
		System.out.println("The value in () is the number being checked.");
		System.out.println("____________________________________________");
		
		//Test #1
		BigInteger a = new BigInteger("1");
		checkPrime.setNumber(a);
		System.out.println();
		System.out.println("Test #1(1)-  Expected Result: false   | Value Returned: " + checkPrime.IsBigIntPrime());//tells what the system should output and what it actually does
		if (checkPrime.IsBigIntPrime() == false) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		
		//Test #2
		a = new BigInteger("2");
		checkPrime.setNumber(a);
		System.out.println();
		System.out.println("Test #2(2)-  Expected Result: true   | Value Returned: " + checkPrime.IsBigIntPrime());//tells what the system should output and what it actually does
		if (checkPrime.IsBigIntPrime() == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		
		//Test #3
		a = new BigInteger("1234567");
		checkPrime.setNumber(a);
		System.out.println();
		System.out.println("Test #3(1234567)-  Expected Result: false   | Value Returned: " + checkPrime.IsBigIntPrime());//tells what the system should output and what it actually does
		if (checkPrime.IsBigIntPrime() == false) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		
		//Test #4
		a = new BigInteger("1299019");
		checkPrime.setNumber(a);
		System.out.println();
		System.out.println("Test #4(1299019)-  Expected Result: true   | Value Returned: " + checkPrime.IsBigIntPrime());//tells what the system should output and what it actually does
		if (checkPrime.IsBigIntPrime() == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		
		//Test #5
		a = new BigInteger("36");
		checkPrime.setNumber(a);
		System.out.println();
		System.out.println("Test #5(36)-  Expected Result: false   | Value Returned: " + checkPrime.IsBigIntPrime());//tells what the system should output and what it actually does
		if (checkPrime.IsBigIntPrime() == false) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		
		//Test #6
		a = new BigInteger("157");
		checkPrime.setNumber(a);
		System.out.println();
		System.out.println("Test #6(157)-  Expected Result: true   | Value Returned: " + checkPrime.IsBigIntPrime());//tells what the system should output and what it actually does
		if (checkPrime.IsBigIntPrime() == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		
		//Test #7
		a = new BigInteger("2500001221");
		checkPrime.setNumber(a);
		System.out.println();
		System.out.println("Test #7(2500001221)-  Expected Result: true   | Value Returned: " + checkPrime.IsBigIntPrime());//tells what the system should output and what it actually does
		if (checkPrime.IsBigIntPrime() == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		
		//Test #8
		a = new BigInteger("7919");
		checkPrime.setNumber(a);
		System.out.println();
		System.out.println("Test #8(7919)-  Expected Result: true   | Value Returned: " + checkPrime.IsBigIntPrime());//tells what the system should output and what it actually does
		if (checkPrime.IsBigIntPrime() == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		
		//Test #9
		a = new BigInteger("4969");
		checkPrime.setNumber(a);
		System.out.println();
		System.out.println("Test #9(4969)-  Expected Result: true   | Value Returned: " + checkPrime.IsBigIntPrime());//tells what the system should output and what it actually does
		if (checkPrime.IsBigIntPrime() == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		
		//Test #10
		a = new BigInteger("1346");
		checkPrime.setNumber(a);
		System.out.println();
		System.out.println("Test #10(1346)-  Expected Result: false   | Value Returned: " + checkPrime.IsBigIntPrime());//tells what the system should output and what it actually does
		if (checkPrime.IsBigIntPrime() == false) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		
		//Test #11
		a = new BigInteger("17");
		checkPrime.setNumber(a);
		System.out.println();
		System.out.println("Test #11(17)-  Expected Result: true   | Value Returned: " + checkPrime.IsBigIntPrime());//tells what the system should output and what it actually does
		if (checkPrime.IsBigIntPrime() == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		
		//Test #12
		a = new BigInteger("0");
		checkPrime.setNumber(a);
		System.out.println();
		System.out.println("Test #12(0)-  Expected Result: false   | Value Returned: " + checkPrime.IsBigIntPrime());//tells what the system should output and what it actually does
		if (checkPrime.IsBigIntPrime() == false) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
	}

}
