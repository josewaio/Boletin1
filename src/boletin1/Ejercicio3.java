package boletin1;

public class Ejercicio3 {

	public static void main(String[] args) {
//		3.Dados los siguientes valores para las variables booleanas a, b y c ( a = true,
//				b = false y c = true), evaluar las expresiones que aparecen a continuación:
//				a=true, b=false, c=true
//				a) a && b || a && c 				true
//				b) (a || ! b) && (! a || c)			true
//				c) a || b && c						true
//				d) ! (a || b) && c					false
		boolean a= true, b = false, c = true;
		System.out.println(a && b || a && c);
		System.out.println((a || ! b) && (! a || c));
		System.out.println(a || b && c);
		System.out.println(! (a || b) && c);		
	}

}
