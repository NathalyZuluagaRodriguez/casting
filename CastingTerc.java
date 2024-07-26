
public class CastingTerc {
	public static void main(String args[]) {
		int numeroEntero = 10;
	    System.out.println("Valor original de int: " + numeroEntero);
	
	    
	    double numeroDecimal = (double) numeroEntero;
	    System.out.println("Valor convertido de int a double: " + numeroDecimal);
	
	    
	    float numeroFlotante = (float) numeroEntero;
	    System.out.println("Valor convertido de int a float: " + numeroFlotante);
	
	    
	    double resultadoSuma = numeroDecimal + numeroFlotante;
	
	    
	    System.out.println("El resultado de la suma de double y float es: " + resultadoSuma);
	}
}