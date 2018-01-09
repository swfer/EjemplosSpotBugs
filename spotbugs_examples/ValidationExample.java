package spotbugs_examples;

/**
 * Ejemplo validación
 * 
 * Se quiere comprobar que wordA es igual que wordB, y que numberA es igual a numberB. 
 * Si efectivamente lo son se mostrará un resultado por consola u otro resultado si no son iguales.
 *
 */
public class ValidationExample {

	public static void example() {
		
		String wordA = "Patatas";
		String wordB = "Patatas";
		
		int numberA = 1;
		int numberB = 1;
				
		if (wordA.equals(wordB) && numberA == numberB) {
			System.out.println("Ejemplo validación: Resultado A");
		}else {
			System.out.println("Ejemplo validación: Resultado B");
		}
	}
	
}
