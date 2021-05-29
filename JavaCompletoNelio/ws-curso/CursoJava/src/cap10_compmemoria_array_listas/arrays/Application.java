package cap10_compmemoria_array_listas.arrays;

import java.util.Locale;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdAlturas = sc.nextInt();
		
		double[] vect = new double[qtdAlturas];
		
		for(int i = 0; i < qtdAlturas; i++) {
			
			vect[i] = sc.nextDouble();
			
		}
		
		
		double soma = 0;
		
		for(int i = 0; i < qtdAlturas; i++) {
			
			soma+= vect[i];
			
		}
		double avg = soma / qtdAlturas;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n ", avg);
		
		sc.close();
	}
}
