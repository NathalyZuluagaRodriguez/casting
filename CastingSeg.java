import java.util.Scanner;

public class CastingSeg {
	public static void main(String args[]) {
	
	Scanner entrada = new Scanner(System.in);
    
     System.out.print("Ingresa tu edad (en años): ");
     String edadString = entrada.nextLine();

    
     int edad = Integer.parseInt(edadString);

    
     System.out.print("Ingresa tu altura (en metros, ej. 1.75): ");
     String alturaString = entrada.nextLine();

    
     double altura = Double.parseDouble(alturaString);

    
     int edadEnMeses = edad * 12;

    
     System.out.println("Tienes " + edad + " años.");
     System.out.println("Eso equivale a " + edadEnMeses + " meses.");
     System.out.println("Mides " + altura + " metros.");

    
     entrada.close();
     
	}
}
