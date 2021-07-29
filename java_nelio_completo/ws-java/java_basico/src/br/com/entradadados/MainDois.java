package br.com.entradadados;

import java.util.Locale;
import java.util.Scanner;

public class MainDois {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String s1, s2, s3;
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		System.out.println("-----Quebra de linha pendente------------");
		int x;
		
		x = sc.nextInt();
		sc.nextLine();
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
