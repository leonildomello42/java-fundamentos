package cap6_EstruturasRepetitivas;

import java.util.Scanner;

public class EstruturaWhileDoWhile {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x != 0 ){

            System.out.println(x);
            x = sc.nextInt();
        }
        sc.close();


        x = 20;
        do{
            System.out.println("Oi");
            
            x-=1;
        }while (x > 10);
    }

}
