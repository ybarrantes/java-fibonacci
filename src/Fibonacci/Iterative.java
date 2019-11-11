package Fibonacci;

import java.math.BigInteger;

import Structs.BigIntegerStruct;

/**
 * Calcula el número Fibonacci utilizando el método iterativo
 * @author ybarrantes
 *
 */
public class Iterative implements IFibonacci
{
	public BigIntegerStruct calculate(int n)
	{
		BigInteger a = new BigInteger(Integer.toString(0));
		BigInteger b = new BigInteger(Integer.toString(1));
		
		long tmIni = System.currentTimeMillis();
		
		for(int i = 0; i < n; i++) 
		{
			// forma 1 apoyandonos en una tercera variable (uso de ram)
			BigInteger c = a.add(b);
			a = b;
			b = c;
			
			// forma 2 sin apoyo de otra variable, pero implica realizar mas calculos (uso de procesador)
			//b = a.add(b);
			//a = b.subtract(a);
		}
		
		long tmFin = System.currentTimeMillis();
		
		return new BigIntegerStruct(a, (tmFin - tmIni));
	}
}
