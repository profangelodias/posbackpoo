package uri_1067;
import java.io.IOException;
import java.util.Scanner;

/**
* IMPORTANT: 
*      O nome da classe deve ser "Main" para que a sua solução execute
*      Class name must be "Main" for your solution to execute
*      El nombre de la clase debe ser "Main" para que su solución ejecutar
*/
public class Main {

   public static void main(String[] args) throws IOException {

	   //Declaração das variáveis
	   int x;
	   int i = 1;
	   
	   //Input
	   Scanner leitor = new Scanner(System.in);
	   x = leitor.nextInt();
	   
	   //Loop While 
	   while(i <= x) {
		   //Lógica
		   if (i % 2 == 1 ) {
			   System.out.println(i);
		   }
		   //Incremento
		   i++; // i = i +1
	   }
   }
}