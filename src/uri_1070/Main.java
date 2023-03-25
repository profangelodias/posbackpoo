package uri_1070;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Variáveis
		int x;
		int cont = 1;
		// Input
		Scanner leitor = new Scanner(System.in);
	    x = leitor.nextInt();
	    // lóica
//	    while (cont <= 6) {
//	    	if (x % 2 == 1) {
//	    		System.out.println(x);
//	    		//repetição de impressão
//	    		cont++;
//	    	}
//	    	//incremento do X
//	    	x++;
//	    }
	    for(cont = 1;cont<=6;x++) {
	    	if (x % 2 == 1) {
	    		System.out.println(x);
	    		//repetição de impressão
	    		cont++;
	    	}
	    }
	     
	     
	}

}
