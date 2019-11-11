package Fibonacci;

import Structs.BigIntegerStruct;

public interface IFibonacci {
	/**
	 * Calcula el número Fibonacci
	 * 
	 * @param i Número a calcular
	 * @return Estructura con el resultado de respuesta y tiempo de ejecución utilizado
	 * @author ybarrantes
	 */
	public BigIntegerStruct calculate(int i);
}
