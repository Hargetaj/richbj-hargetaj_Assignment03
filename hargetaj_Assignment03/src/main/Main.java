/*
Name: Alex Hargett, Bruce Rich
Class Number and Section: Programming 2 (002)
Assignment #: 03
Due date: 1/29/2018
Description: This will test BigInteger data values for there Prime-ness
 */
package main;
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
		BigIntPrime checkPrime = new BigIntPrime(1);
		
		//Now we will test the results to see if they are accurate
		System.out.println("The value in () is the number being checked.");
		System.out.println("____________________________________________");
		
		//Test #1
		checkPrime = BigIntPrime(1);
		System.out.println();
		System.out.println("Test #1(1)-  Expected Result: false   | Value Returned: " + checkPrime);//tells what the system should output and what it actually does
		if (checkPrime == false) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		checkPrime = false;//reset the value back to default so it doesn't affect future test
		
		//Test #2
		checkPrime = BigIntPrime(2);
		System.out.println();
		System.out.println("Test #2(2)-  Expected Result: true   | Value Returned: " + checkPrime);//tells what the system should output and what it actually does
		if (checkPrime == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		checkPrime = false;//reset the value back to default so it doesn't affect future test
		
		//Test #3
		checkPrime = BigIntPrime(1234567);
		System.out.println();
		System.out.println("Test #3(1234567)-  Expected Result: false   | Value Returned: " + checkPrime);//tells what the system should output and what it actually does
		if (checkPrime == false) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		checkPrime = false;//reset the value back to default so it doesn't affect future test
		
		//Test #4
		checkPrime = BigIntPrime(1299019);
		System.out.println();
		System.out.println("Test #4(1299019)-  Expected Result: true   | Value Returned: " + checkPrime);//tells what the system should output and what it actually does
		if (checkPrime == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		checkPrime = false;//reset the value back to default so it doesn't affect future test
		
		//Test #5
		checkPrime = BigIntPrime(36);
		System.out.println();
		System.out.println("Test #5(36)-  Expected Result: false   | Value Returned: " + checkPrime);//tells what the system should output and what it actually does
		if (checkPrime == false) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		checkPrime = false;//reset the value back to default so it doesn't affect future test
		
		//Test #6
		checkPrime = BigIntPrime(157);
		System.out.println();
		System.out.println("Test #6(157)-  Expected Result: true   | Value Returned: " + checkPrime);//tells what the system should output and what it actually does
		if (checkPrime == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		checkPrime = false;//reset the value back to default so it doesn't affect future test
		
		//Test #7
		checkPrime = BigIntPrime(987653);
		System.out.println();
		System.out.println("Test #7(987653)-  Expected Result: false   | Value Returned: " + checkPrime);//tells what the system should output and what it actually does
		if (checkPrime == false) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		checkPrime = false;//reset the value back to default so it doesn't affect future test
		
		//Test #8
		checkPrime = BigIntPrime(7919);
		System.out.println();
		System.out.println("Test #8(7919)-  Expected Result: true   | Value Returned: " + checkPrime);//tells what the system should output and what it actually does
		if (checkPrime == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		checkPrime = false;//reset the value back to default so it doesn't affect future test
		
		//Test #9
		checkPrime = BigIntPrime(4969);
		System.out.println();
		System.out.println("Test #9(4969)-  Expected Result: true   | Value Returned: " + checkPrime);//tells what the system should output and what it actually does
		if (checkPrime == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		checkPrime = false;//reset the value back to default so it doesn't affect future test
		
		//Test #10
		checkPrime = BigIntPrime(1346);
		System.out.println();
		System.out.println("Test #10(1346)-  Expected Result: false   | Value Returned: " + checkPrime);//tells what the system should output and what it actually does
		if (checkPrime == false) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		checkPrime = false;//reset the value back to default so it doesn't affect future test
		
		//Test #11
		checkPrime = BigIntPrime(17);
		System.out.println();
		System.out.println("Test #11(17)-  Expected Result: true   | Value Returned: " + checkPrime);//tells what the system should output and what it actually does
		if (checkPrime == true) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		checkPrime = false;//reset the value back to default so it doesn't affect future test
		
		//Test #12
		checkPrime = BigIntPrime(0);
		System.out.println();
		System.out.println("Test #12(0)-  Expected Result: false   | Value Returned: " + checkPrime);//tells what the system should output and what it actually does
		if (checkPrime == false) {//checks if the code accurately displays if the number is prime
			System.out.println("----------Test Passed----------");//alerts user that the test was a success and the code worked
		}else System.out.println("----------Test Failed----------");//alerts the user that there was a error
		checkPrime = false;//reset the value back to default so it doesn't affect future test
	}

}
