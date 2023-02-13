package uri_1005;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        double a;
        double b;
        double media;
        double pesoA = 3.5;
        double pesoB = 7.5;
    	
    	Scanner leitor = new Scanner(System.in);
        a = leitor.nextDouble();
        b = leitor.nextDouble();
        media = ((pesoA * a) + (pesoB * b))/(pesoA + pesoB);
        System.out.println(String.format("MEDIA = %.5f" , media));
    }
}

