package Fibonacci;

import Structs.BigIntegerStruct;

public interface IFibonacci {
	/**
	 * Calcula el n�mero Fibonacci
	 * 
	 * @param i N�mero a calcular
	 * @return Estructura con el resultado de respuesta y tiempo de ejecuci�n utilizado
	 * @author ybarrantes
	 */
	public BigIntegerStruct calculate(int i);
}
