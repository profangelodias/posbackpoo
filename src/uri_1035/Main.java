package uri_1035;
import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

    	int a,b,c,d;
    	
    	Scanner leitor = new Scanner(System.in);
    	a = leitor.nextInt();
    	b = leitor.nextInt();
    	c = leitor.nextInt();
    	d = leitor.nextInt();
    	
    	if (b > c && d > a && (c + d) > (a+b) && c > 0 && d > 0 && a % 2 == 0) {
    		System.out.println("Valores aceitos");
			
		} else {
			System.out.println("Valores nao aceitos");
			
		}
    	
    }
 
}