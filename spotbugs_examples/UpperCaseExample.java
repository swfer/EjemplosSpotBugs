package spotbugs_examples;

/**
 * Ejemplo texto en mayúsculas 
 * 
 * Se quiere cambiar el contenido de la variable word a mayúsculas y seguidamente 
 * comprobar que efectivamente la palabra se ha cambiado a mayúsculas. Dependiendo
 * de si realmente se ha cambiado o no, se producirá dos salidas distintas por consola.
 *
 */
public class UpperCaseExample {

	public static void example() {
		String word = "Calidad";
		word.toUpperCase();
		
		if (word.equals("CALIDAD")) {
			System.out.println("Ejemplo texto en mayúsculas: Resultado A");
		}else {
			System.out.println("Ejemplo texto en mayúsculas: Resultado B");
		}
	}
	
}
