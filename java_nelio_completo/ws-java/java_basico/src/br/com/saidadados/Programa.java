package br.com.saidadados;

import java.util.Locale;

public class Programa {

	public static void main(String[] args) {

		System.out.print("Olá mundo! ");
		System.out.println("Bom dia!");
		
		int y = 32;
		
		System.out.println("variável: " + y );
		
		System.out.println("-----------------------------------");
		
		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f%n", x);
		
		System.out.println("-----------------------------------");

		Locale.setDefault(Locale.US);
		double x_2 = 10.35784;
		
		System.out.println(x_2);
		System.out.printf("%.2f\n", x_2);
		
		System.out.println("-----------------------------------");
		
		System.out.println("Resultado = "+ x + " Metros");
		System.out.printf("Resultado = %.2f Metros%n", x);
		
		System.out.println("-----------------------------------");
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d e ganha R$ %.2f reais.%n", nome, idade, renda);
		

	}

}
