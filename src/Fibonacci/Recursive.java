package Fibonacci;
import java.math.BigInteger;
import Structs.BigIntegerStruct;

/**
 * Calcula el número Fibonacci utilizando el metodo recursivo
 * @author ybarrantes
 *
 */
public class Recursive extends FibonacciClass
{

	// estructura que almacena los resultados del calculo del numero 
	// Fibonacci evitando reprocesos
	private BigIntegerStruct memoization[] = null;
	
	public BigIntegerStruct calculate(int n) {
		// si la variable es nula, la inicializamos
		if(this.memoization == null)
		{
			this.memoization = new BigIntegerStruct[n + 1];
		}
		
		BigInteger result = new BigInteger(Integer.toString(n));
		long tmIni = System.currentTimeMillis();
		
		if(n < 0) throw new IllegalArgumentException("El número a calcular debe ser mayor o igual a cero");
		else if(this.memoization[n] != null) return this.memoization[n];
		else if(n > 1) result = this.calculate(n - 1).Numero.add(this.calculate(n - 2).Numero);
		
		long tmFin = System.currentTimeMillis();
		
		this.memoization[n] = new BigIntegerStruct(result, (tmFin - tmIni));
		
		return this.memoization[n];
	}

	
}
