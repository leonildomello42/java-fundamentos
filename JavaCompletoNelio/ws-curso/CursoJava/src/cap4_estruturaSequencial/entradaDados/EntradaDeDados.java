package cap4_estruturaSequencial.entradaDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double doub;
		char carac;
		
		x = sc.next();
		y = sc.nextInt();
		doub = sc.nextDouble();
		carac = sc.next().charAt(0);
		
		System.out.println(x);
		
		sc.close();
	}
}
