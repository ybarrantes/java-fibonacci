package Structs;
import java.math.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
public class BigIntegerStruct {
	// constantes
	public final long KILOBYTE = 1024L;
	public final long MEGABYTE = this.KILOBYTE * this.KILOBYTE;
	
	// propiedades de clase
	public BigInteger Numero;
	public long Time;
	
	/**
	 * Constructor
	 * 
	 * @param n Número resultado calculo fibonacci
	 * @param t Tiempo empleado para el calculo
	 */
	public BigIntegerStruct(BigInteger n, long t) 
	{
		this.Numero = n;
		this.Time = t;
	}
	
	/**
	 * Retorna un string con el resultado del calculo del numero fibonacci en formato de notacion cientifica
	 * @return
	 */
	public String getNumeroNotacionCientifica()
	{
		NumberFormat formatter = new DecimalFormat("0.######E0", DecimalFormatSymbols.getInstance(Locale.ROOT));
	    String str = formatter.format(this.Numero);
	    
		BigDecimal bd = new BigDecimal(str);
		
		return bd.toString();
	}
	
	/**
	 * Otiene el numero de bytes usados en el proceso
	 * @return
	 */
	private long getUsedMemory()
	{
		Runtime runtime = Runtime.getRuntime();		
		runtime.gc();		
		return runtime.totalMemory() - runtime.freeMemory();
	}
	
	private long getUsedMemoryIn(long medida)
	{
		long memory = this.getUsedMemory();
		return memory / medida;
	}
	
	public String toString()
	{		
		return "   Numero: " + this.Numero + "\n   Notacion Cientifica: " + this.getNumeroNotacionCientifica() + "\n   Time: " + this.Time + " ms\n   UsedMemory: " + this.getUsedMemoryIn(this.KILOBYTE) + " Kb";
	}

}
