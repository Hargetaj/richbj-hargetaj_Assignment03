/***************************************************
 * Name: Bruce Rich / Alex Hargett
 * 
 * Class number and section: IT2045C 002
 * 
 * Assignment: richbj-hargetaj_Assignment03
 * 
 * Due Date: 2/1/2018
 * 
 * Description: This program supllies test cases for a class 
 * that tests a BigInteger variable for primeness
 * 
 * Citation: Cay Horstman, "Big Java Late Projects"
 * 
 * Anything else:
 **************************************************/
package bigIntPrime;

import java.math.BigInteger;

/**
 * 
 * @author Bruce Rich
 *
 */
public class BigIntPrime
{
	private static BigInteger number;
	
	/**gets the value of number
	 * @return the number
	 */
	public BigInteger getNumber()
	{
		return number;
	}

	/**sets the value of number
	 * @param number the number to set
	 */
	public void setNumber(BigInteger number)
	{
		this.number = number;
	}
	
	public BigIntPrime() {}
	
	public BigIntPrime(BigInteger number)
	{
		setNumber(number);
	}

	public static boolean IsBigIntPrime()
	{
		//create variables that can used to perform operations with other big integers.
		BigInteger one = new BigInteger("1");
		BigInteger two = new BigInteger("2");
		BigInteger zero = new BigInteger("0");
		BigInteger mod = number.mod(BigInteger.valueOf(2));		// creates a variable mod that represents the modulus of number and 2
		BigInteger number2 = number.divide(BigInteger.valueOf(2));// creates a variable that represents number divided by 2
		boolean result = true;
				
		if(number.equals(one) )		// if the number equals 1, return false
		{
			return false;
		}
		if(number.equals(two))		// if the number equals 2, return true	
		{
			return true;
		}
		if (mod.equals(zero))		// if the number equals 0, return false
		{
			return false;
		}
				
		for(BigInteger i = BigInteger.valueOf(3);
				i.compareTo(number2) < 0;
				i = i.add(BigInteger.valueOf(2)))
		{
			BigInteger mod2 = number.mod(i);	// creates a variable that represents the modulus of number and i
			if (mod2.equals(zero))		// if mod2 equals zero, return false
			{
				return false;
			}
		}
		return result;		// if none of the above are true, return the result
	}
	
}
