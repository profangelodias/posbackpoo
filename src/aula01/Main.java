package aula01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Conta c1 = new Conta(); // Criamos um objeto
		
		c1.numero = 1;
		c1.nome = "Angelo";
		c1.saldo = 1000000;
		
		Conta c2 = new Conta(2, "Dias", 50.00);
		
		System.out.println("Saldo da Conta 1:" + c1.saldo);
		double valorSaquec1 = 100000;
		c1.sacar(valorSaquec1);
		System.out.println("Saldo da Conta 1 após saque de "+ 
		valorSaquec1 + " :" + c1.saldo);
		
		c2.sacar(5.0);
		
		System.out.println("Saldo após churros:" + c2.sacar(5.0));
		
		
		System.out.println("Saldo após churros:" + c2.saldo);
		
		/*Criando digitação do usuário.*/
		/*Criar objeto Scanner com identificador.*/
		Scanner numConta = new Scanner(System.in);
		/*Imprimir informação para o usupario antes da digitação*/
		System.out.println("Escreva o número da conta: ");
		/*Receber informação digitada pelo usuário*/
		int var_a = numConta.nextInt();
		
		Conta c3 = new Conta(3, "Gonçalves");
		Conta c4 = new Conta(4, "Quatro");
		Conta c5 = new Conta(5, "Cinco");
		
		System.out.println("Saldo da conta c3:" + c3.saldo);
		c3.depositar(100000);
		System.out.println("Saldo da conta c3 após 1o salário:" + c3.saldo);
	
	
	}

}
