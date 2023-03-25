package aula03_Pessoa;

public class Funcionario extends Pessoa{
	
	private int matricula;
	private String cargo;
	private double salario;
	private int dataAdmissao;

	//Construtor completo Ciente + Pessoa
	public Funcionario(String nome, int data, String end, Telefone tel, int matricula, String cargo, double salario, int dataAdmissao) {
		super(nome, data, end, tel);
		this.cargo = cargo;
		this.dataAdmissao = dataAdmissao;
		this.matricula = matricula;
		this.salario = salario;
		// TODO Auto-generated constructor stub
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(int dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public void reajustarSalario(double perc) {

	}
	
	
	

}
