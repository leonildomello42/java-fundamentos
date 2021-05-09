package cap4_EstruturaSequencial;

import java.util.Locale;

public class SaidaDeDados {
	
	public static void main(String[] args) {
		
		System.out.print("Olá mundo!");
		System.out.println(" Bom dia!");
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println("valor de y: " + y);
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f Metros%n", x);
	}

}
