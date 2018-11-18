package boletin1;

public class Ejercicio2 {

	public static void main(String[] args) {
//		2.Calcula el resultado de las siguientes expresiones:
//			a) 3 * 5 – 4 / 2			13
//			b) 3 – (4 * 5)^2 / 4        -97.00
//			c) 3^2 – 5 * 2				-1.0
//			d) 7 – 4 * 2 – 5 * 2	   -11
//			e) 5 + 4 < 7 + 8			true
//			f) 4 < 5 * 4 / 2 – 7		false
//			g) 3 + 6 * 14				87
//			h) 8 + 7 * 3 + 4 * 6		53
//			i) - 4 * 7 + 2^3 / 4 – 5	-31.0
//			j) 12 + 3 * 7 + 5 * 4		53
//			k) ! (4 > 6)				true
//			l) 7^3 / 2 + 6				177.5
		System.out.printf("Resultado a: %d\nResultado b: %.2f\n"
				+ "Resultado c: %.2f\nResultado d: %d\nResultado e: %b\n"
				+ "Resultado f: %b\nResultado g: %d\n"
				+ "Resultado h: %d\nResultado i: %.2f\n"
				+ "Resultado j: %d\nResultado k: %b\n"
				+ "Resultado l: %.2f\n"
				,3 * 5 - 4 / 2, 
				3 - Math.pow((4 * 5),2)/ 4, Math.pow(3,2) - 5 * 2,
				7 - 4 * 2 - 5 * 2, 5 + 4 < 7 + 8 , 
				4 < 5 * 4 / 2 - 7,
				3 + 6 * 14,	8 + 7 * 3 + 4 * 6, 
				- 4 * 7 + Math.pow(2, 3) / 4 -5, 12 + 3 * 7 + 5 * 4,
				! (4 > 6), Math.pow(7, 3)/2 +6);
		
		
	}

}
