package Fibonacci;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;


import Structs.BigIntegerStruct;

public class Formula implements IFibonacci {
	
	private double sqrt5 = Math.sqrt(5);

	@Override
	public BigIntegerStruct calculate(int i) {
		long tmIni = System.currentTimeMillis();
		
		BigDecimal polynomial = getEq(i, ((1 + this.sqrt5) / 2));
		polynomial = polynomial.divide(new BigDecimal(Double.toString(this.sqrt5)), MathContext.DECIMAL128);
		BigInteger result = polynomial.add(BigDecimal.valueOf(0.5), MathContext.DECIMAL128).toBigInteger();
		
		long tmFin = System.currentTimeMillis();
		
		return new BigIntegerStruct(result, (tmFin - tmIni));
	}
	
	private BigDecimal getEq(int n, double polynomial) {
		//BigDecimal x = new BigDecimal(Double.toString((1 / this.sqrt5)));
		BigDecimal y = new BigDecimal(Double.toString(polynomial), MathContext.DECIMAL128);
		//return x.multiply(y.pow(n));
		return y.pow(n, MathContext.DECIMAL128);
	}

}
