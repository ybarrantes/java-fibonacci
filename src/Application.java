import java.util.Scanner;
import Structs.BigIntegerStruct;

public class Application {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		menu();
	}
	
	/**
	 * Muestra en pantalla el menu de opciones
	 */
	private static void menu()
	{		
		String opcion = "";
		do
		{
			System.out.println("-- Menú principal --");
			System.out.println("   1 - Fibonacci (Modo Recursivo)");
			System.out.println("   2 - Fibonacci (Modo Iterativo)");
			System.out.println("   3 - Fibonacci (Modo Formula)");
			System.out.println("  99 - Salir");
			System.out.print("Ingrese una opción: ");
			
			opcion = input.next();
			
			System.out.println("");
			System.out.println(evaluarOpcion(opcion));
			System.out.println("");			
		} while (!opcion.equals("99"));
		
		input.close();
	}
	
	/**
	 * Evalua la opcion ingresada por el usuario
	 * @param opcion
	 * @return
	 */
	private static String evaluarOpcion(String opcion)
	{
		switch(opcion)
		{
			case "1":
				return calcularFibonacci(new Fibonacci.Recursive());
			case "2":
				return calcularFibonacci(new Fibonacci.Iterative());
			case "3":
				return calcularFibonacci(new Fibonacci.Formula());
			case "99":
				return "Adios!";
			default:
				return "La opción seleccionada es inválida!!";
		}
	}
	
	/**
	 * Pide al usuario el ingreso de un dato entero
	 * @return
	 */
	private static int leerEntero()
	{
		int numero = 0;		
		do
		{			
			try
			{
				System.out.print("Ingrese un número entero: ");
				numero = input.nextInt();
				break;
			} catch(Exception e)
			{
				System.out.println("");
				System.out.println("  - Error, el valor ingresado debe ser un número entero");
				input.next();
				continue;
			}
		} while(true);
		
		return numero;
	}
	
	private static String calcularFibonacci(Fibonacci.IFibonacci fib)
	{
		return fib.calculate(leerEntero()).toString();
	}

}
