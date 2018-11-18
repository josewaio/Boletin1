package boletin1;

public class Ejercicio5 {

	public static void main(String[] args) {
		int x= 10, y = 19;
		boolean j = true, k = false;
//		5. Dados los siguientes valores de las variables x, y, j y k, añadir los paréntesis que sean
//		necesarios para que las expresiones que las siguen evalúen a verdadero: 
//		x = 10; y = 19;
//		j = true; k = false
//
//		a) x ==y || j				x == y || j  No necesita de ningún parentesis ya que la igualdad es de prioridad
//												7 y el or 12
//		b) x >= y || x <= y && j	x >= y || x <= y && j No necesita, primero se evalua la expresión de la izquierda
//														  del or, despues el menor o igual, que da true, despues el and
//														  y finalmente el or
//		c) ! j || j					! j || j			  No necesita parentesis al ser el ! de prioridad 2 y el or 12
//		d) ! k && k					! (k && k)			  Al ser el not de prioridad 2 y el and 12, se necesita un parentesis
		
		System.out.println("a) "+(x ==y || j));
		System.out.println("b) "+(x >= y || x <= y && j));
		System.out.println("c) "+(! j || j));
		System.out.println("d) "+ (! (k && k)));
	}

}
