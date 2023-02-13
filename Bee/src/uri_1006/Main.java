package uri_1006;

import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
    	double a;
    	double b;
    	double c;
    	double media;
    	
    	double pesoA = 2;
    	double pesoB = 3;
    	double pesoC = 5;
    	
    	Scanner leitor = new Scanner(System.in);
    	a = leitor.nextDouble();
    	b = leitor.nextDouble();
    	c = leitor.nextDouble();
    	
    	media = ((a * pesoA) + (b * pesoB) + (c * pesoC))/10;
    	
    	System.out.println(String.format("MEDIA = %.1f", media));
    	
    }
 
}