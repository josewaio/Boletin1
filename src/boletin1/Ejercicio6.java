package boletin1;

public class Ejercicio6 {

	public static void main(String[] args) {
		final int MAX = 1000;
		int i, a=3, b=4;
		double x;
		char c,s;
//		6. Sea MAX una constante que vale 1000, x una variable decimal y a, b e i variables enteras.
//		Indicar las sentencias válidas y su valor, razonando la respuesta.
//		Suponer a = 3 y b = 4.
//		a) i = (990 - MAX) / a  Es valida y su resultado es -3 porque una variable entera recorta la parte decimal
//		b) i = b / 0			Error aritmetico, no se puede dividir entre cero en los enteros
//		c) i = a % (MAX - 990)	Valida, el resto es 3
//		d) i = (MAX - 990) % a  Valida, el resto es 1
//		e) i = 3.34 * a			Invalida, hay que hacer casting porque es un double
//		f) x = a / b			Valida, resultado 0.00
//		g) x = a % (a / b)		Invalida, no se puede dividir entre cero con tipo int
//		h) i = a / b			Valida, resultado 0
//		i) i=++a				Valida, i=4, primero suma y luego asigna
//		j) i=a++				Valida, i=3, primero asigna y luego suma
//		k) c=''';				Invalida, falta el carácter de escape \
//		l) c='”';				Valida, la doble comilla no genera problemas para el compilador en literales carácter.
//		m) s='c';				Invalida, porque estamos asignando un literal carácter a una cadena
//		n) s=”'”;				Valida, resultado ', los strings aceptan la comilla simple
//		o) s=”””;				Invalida, falta el carácter de escape \
//		p) c='\u0041';			Valida, es la A mayúscula unicode
//		q) c=65					Valida, es la A mayúscula en decimal
	System.out.println("a) "+(i = (990 - MAX) / a));
	System.out.println("c) "+(i = a % (MAX - 990)));
	System.out.println("e.1) "+(i = (int)3.34 * a));
	System.out.println("e.2) "+(i = (int)( 3.34 * a)));
	System.out.println("f) "+(x = a / b));
	System.out.println("h) "+(i = a / b));
	System.out.println("i) "+(i=++a));
	a=3;
	System.out.println("j) "+(i=a++));
	System.out.println("l) "+(c='”'));
	System.out.println("s) '");
	System.out.println("p) "+(c='\u0041'));
	System.out.println("q) "+(c=65));
	
	}

}
