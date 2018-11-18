package boletin1;

public class Ejercicio4 {

	public static void main(String[] args) {
//		4. De las siguientes asignaciones ¿cuáles son válidas? ¿Cuál es el efecto de su ejecución? ¿De
//				qué tipo deben ser las variables?
//				a) z = 2 < 1 							Valida, z variable de tipo boolean
//				b) a = a + 1 							Valida, a variable de tipo numerico, cadena o caracter con casting
//				c) sqrt(3) = 32717						Erronea, no se puede asignar un literal a una operación 
//				d) ‘x’ = ‘y’							Erronea, no se puede asignar un literal caracter a otro
//				e) x = ‘y’								Valida, x variable de tipo caracter
//				f) a = b								Valida, a y b deben ser del mismo tipo o compatible, asigna el valor de b a a
//				g) precio = precio – precio*(30/100)	Valida, precio de tipo literal numérico
		char a = 'c'; 
		a++;
		System.out.println(a);
		double precio = 100.00;
		precio = precio - (precio*30/100);
		System.out.println(precio);
		
		System.out.println(30/100);
	}

}
