package boletin1;

public class Ejercicio7 {

	public static void main(String[] args) {
		int lado1 = 3, lado2 = 4, hipotenusa = 5;
		double precio = 325.6;
		char ch = '7';
		boolean comprar = false;
//		7. Suponiendo realizadas las siguientes sentencias de asignación: 
//		lado1 = 3; 
//		precio = 325.6; 
//		lado2 = 4; 
//		comprar = false; 
//		hipotenusa = 5; 
//		ch = ‘7’. 
//		Determinar cuáles de las expresiones
//		siguientes dan un resultado booleano y cuáles no. Para aquellas que produzcan un resultado
//		booleano determinar si el resultado es verdadero o falso. Para las que no lo sean, explicar la
//		razón. Indicar también si existe alguna expresión errónea.
//		a) 5 * precio – 1.50 							El resultado no es booleano porque las variables son númericas y se operan
//		b) (precio < 300 + 0.1 * precio) || comprar 	Resultado true porque la expresión de la izquierda es true
//														y en el or con un true es suficiente para evaluar true
//		c) sqrt(lado1) + sqrt(lado2) = sqrt(hipotenusa) Expresion erronea no se pueden asignar expresiones a expresiones
//		d) (! comprar) && (precio + 125.3) 				Expresion erronea, la parte derecha no retorna un booleano
//		e) (ch <= ‘A’) && comprar 						Expresión valida que retorna un false al no ser comprar true
//		f) ch = ‘7’ || ! comprar  						Expresión erronea, la asignación de la izquierda no devuelve un booleano
		
		System.out.println("b) "+((precio < 300 + 0.1 * precio) || comprar ));
		System.out.println("e) "+ ((ch <= 'A') && comprar));
	}

}
