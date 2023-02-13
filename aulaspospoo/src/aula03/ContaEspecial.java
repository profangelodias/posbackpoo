package aula03;

public class ContaEspecial extends Conta{
	double limite;
	
	public ContaEspecial() {
		
	}
	
	public ContaEspecial(int numero, String nome, double saldo, double limite) {
		//chama construtor que atribui os valores em Conta
		super(numero, nome, saldo);

//		this.numero = numero;
//		this.nome = nome;
//		this.saldo = saldo;
		
		this.limite = limite;
	}
	
	public void sacar(double qtd){
		//Liberar qtd para usuário
		//função de soltar dinheiro no caixa
		//Atualizar conta
		double novoSaldo = getSaldo() - (qtd * 0.9);
		setSaldo(novoSaldo);
//		this.saldo = this.saldo - (qtd * 0.9);
	
	}

}
