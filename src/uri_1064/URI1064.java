package tech.angelofdiasg.bee;
import java.io.IOException;
import java.util.Scanner;
 
public class URI1064 {
 public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x[] = new double[6];
        double positivos[] = new double[6];
        
        for (int i = 0; i < 6; i++) {
        	x[i] = leitor.nextDouble();
        	if (x[i] > 0) {
        		cont++;
        		media += x[i];
        		positivos[i] = x[i];
        	}
        }
        media = media / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
        for (int i = 0; i < 6; i++) {       	
        	if (positivos[i] != 0.0 ) {
        		System.out.printf("%.1f ; ", positivos[i]);
        	}
        }
 } 
 	
}








