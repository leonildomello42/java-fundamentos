package br.com.processamentocasting;

public class Main {

	public static void main(String[] args) {
		
		int x, y;
		
		x = 5;
		y = 2 * 5;
		
		
		System.out.println(y);
		
		
		System.out.println("-------------------------------");
		
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;

		area = (b + B) / 2.0 * h;
		System.out.println(area);
		
		
		System.out.println("--------------CASTING-----------------");
		
		int a, b_2;
		double resultado;
		a = 5;
		b_2 = 2;
		resultado = (double) a / b_2;
		System.out.println(resultado);
		
	}
}
