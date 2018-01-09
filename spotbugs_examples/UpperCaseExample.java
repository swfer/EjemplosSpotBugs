package spotbugs_examples;

/**
 * Ejemplo texto en may�sculas 
 * 
 * Se quiere cambiar el contenido de la variable word a may�sculas y seguidamente 
 * comprobar que efectivamente la palabra se ha cambiado a may�sculas. Dependiendo
 * de si realmente se ha cambiado o no, se producir� dos salidas distintas por consola.
 *
 */
public class UpperCaseExample {

	public static void example() {
		String word = "Calidad";
		word.toUpperCase();
		
		if (word.equals("CALIDAD")) {
			System.out.println("Ejemplo texto en may�sculas: Resultado A");
		}else {
			System.out.println("Ejemplo texto en may�sculas: Resultado B");
		}
	}
	
}
