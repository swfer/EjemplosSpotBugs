package spotbugs_examples;

/**
 * Clase principal 
 * 
 * Permite ejeuctar todos los ejemplos del proyecto para obtener por consola 
 * el resultado de ejecuci�n de estos
 *
 */
public class Main {

	public static void main(String[] args) {
		// Ejemplo switch
		SwitchExample.example();
		
		// Ejemplo texto en may�sculas
		UpperCaseExample.example();
		
		// Ejemplo divisi�n
		DivisionExample.example();	
		
		// Ejemplo validaci�n
		ValidationExample.example();	
	}

}
