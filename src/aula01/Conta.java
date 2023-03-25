package aula01;

public class Conta {
	int numero;
	String nome;
	double saldo;
	
	public  Conta() {
		System.out.println("Conta criada!");
	}
	
	public Conta(int numero, String nome, double saldo) {
	this.numero = numero;
	this.nome = nome;
	this.saldo = saldo;
	}
	
	//Criar contrutor com saldo = 0, que continue recebendo o número 
	// e o nome
	
	public Conta(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = 0.0;
		System.out.println("Conta de número "+ numero + " criada!");
	}
	
	double sacar(double qtd){
		return this.saldo = this.saldo - qtd;
	
	}
	
	void depositar(double qtd){
		//double novoSaldo = this.saldo - qtd;
		this.saldo = this.saldo + qtd;
	
	}

}
