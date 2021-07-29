package br.com.entradadados;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		
		String x = input.next();
		
		System.out.println("Você digitou: " + x);
		
		
		System.out.println("-----------------");
		
		int y = input.nextInt();
		System.out.println("Você digitou: " + y);
		
		
		System.out.println("-----------------");
		
		double z = input.nextDouble();
		System.out.println("Você digitou: " + z);
		
		
		System.out.println("-----------------");
		
		char c = input.next().charAt(0);
		System.out.println("Você digitou: " + c);
		
		
		System.out.println("-----------------");
		
		String s;
		int i;
		double d;
		
		s = input.next();
		i = input.nextInt();
		d = input.nextDouble();
		
		input.close();
	}

}
