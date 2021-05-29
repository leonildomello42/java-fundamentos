package cap10_compmemoria_array_listas.arrayComClasses.application;

import java.util.Locale;
import java.util.Scanner;

import cap10_compmemoria_array_listas.arrayComClasses.entities.Product;


public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Product[] vectProduct = new Product[n];
		
		for(int i = 0; i < vectProduct.length; i++) {
			
			sc.nextLine();
			String nome = sc.nextLine();
			double price = sc.nextDouble();
			
			vectProduct[i] = new Product(nome, price);
		}
		
		
		double soma = 0;
				
		for(int i = 0; i < vectProduct.length; i++) {
		
			soma += vectProduct[i].getPrice();
		}
		
		double avg = soma / vectProduct.length;
		
		System.out.println("AVERAGE HEIGHT: " + avg);

	}

}
