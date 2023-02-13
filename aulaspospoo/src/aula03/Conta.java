package aula03;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	
	

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
	
	public void sacar(double qtd){
		this.saldo = this.saldo - qtd;
	
	}
	
	public void depositar(double qtd){
		//double novoSaldo = this.saldo - qtd;
		this.saldo = this.saldo + qtd;
	}
	
	// "GET" Retorna o valor desejado!
	public double getSaldo() {
		return this.saldo;
	}
	
	//"SET" Altera o valor desejado
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
