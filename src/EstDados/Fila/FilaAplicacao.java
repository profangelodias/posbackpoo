package EstDados.Fila;

public class FilaAplicacao {
	 public static void main(String[] args) {
	     Fila f = new Fila();        
	     f.adicionar(10);
	     f.adicionar(12);
	     f.adicionar(30);
	     f.mostrar();
	     f.remover();
	     f.mostrar();
	 }
	}