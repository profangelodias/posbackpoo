package aula03;

public class ContaInvestimento extends Conta{
	double taxa = 1.001;
	int prazo;
	
	public ContaInvestimento(int numero, String nome) {
		super(numero, nome);
		
//		this.numero = numero;
//		this.nome = nome;
//		this.saldo = 0.0;
		
		
	}
	
	public ContaInvestimento() {
		
	}
	
	public void sacar(double qtd){
//		this.saldo = this.saldo - (qtd * taxa);
	}
	
	public void depositar(double qtd){
		//double novoSaldo = this.saldo - qtd;
//		this.saldo = this.saldo + (qtd * taxa);
	}
	
	public void aplicaRendimento() {
//		this.saldo = this.saldo + (this.saldo * taxa);
//		this.saldo += (this.saldo * taxa);
	}

}
