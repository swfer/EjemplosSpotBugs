package spotbugs_examples;

/**
 * Ejemplo switch 
 * 
 * Se definine un switch para cubrir de manera personalizada cada uno de los tres casos:
 * Caso 0, Caso 1 y Caso 2, según el valor de la variable "caso". Se deberá también 
 * cubrir una circunstancia adicional cuando ninguno de los tres casos sea elegido.
 *
 */
public class SwitchExample {

	public static void example() {
	    	int caso = 0;
	    	switch (caso) {
	        	case 0:
	            	System.out.println("Ejemplo switch: Caso 0");
	        	case 1:
	            	System.out.println("Ejemplo switch: Caso 1");
	            	break;
	        	case 2:
	            	System.out.println("Ejemplo switch: Caso 2");
	            	break;
	        	default:
	            	System.out.println("Ejemplo switch: Caso por defecto");
	    	}
	}
	
}
