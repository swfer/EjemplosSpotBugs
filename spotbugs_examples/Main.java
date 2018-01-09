package spotbugs_examples;

/**
 * Clase principal 
 * 
 * Permite ejeuctar todos los ejemplos del proyecto para obtener por consola 
 * el resultado de ejecución de estos
 *
 */
public class Main {

	public static void main(String[] args) {
		// Ejemplo switch
		SwitchExample.example();
		
		// Ejemplo texto en mayúsculas
		UpperCaseExample.example();
		
		// Ejemplo división
		DivisionExample.example();	
		
		// Ejemplo validación
		ValidationExample.example();	
	}

}
