package tech.angelofdiasg.bee;

import java.util.Scanner;

public class URI1065 {
    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
    	 int cont = 0;
    	 int x;
         for (int i = 0; i < 5; i++) {
         	x = leitor.nextInt();
         	if (x % 2 == 0) {
         		cont++;
         	}
         }
         System.out.println(cont + " valores pares");
         System.out.printf("%d valores pares\n", cont);
    }

}
