package bigIntPrime;

import java.math.BigInteger;

public class Main
{

	public static void main(String[] args)
	{
		BigIntPrime checkPrime = new BigIntPrime();
		BigInteger a = new BigInteger("1346");
		checkPrime.setNumber(a);
		System.out.println(checkPrime.IsBigIntPrime());

	}

}
