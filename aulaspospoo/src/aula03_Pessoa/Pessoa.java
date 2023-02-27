package aula03_Pessoa;

public class Pessoa {
	private String nome;
	private int data;
	private String end;
	private Telefone tel;
	
	public Pessoa(String nome, int data, String end, Telefone tel) {
		this.nome = nome;
		this.data = data;
		this.end = end;
		this.tel = tel;
	}
	
	public Pessoa(String nome, int data, String end) {
		this.nome = nome;
		this.data = data;
		this.end = end;
	}
		public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getData() {
		return data;
	}



	public void setData(int data) {
		this.data = data;
	}



	public String getEnd() {
		return end;
	}



	public void setEnd(String end) {
		this.end = end;
	}



	public Telefone getTel() {
		return tel;
	}

	public void setTel(Telefone tel) {
		this.tel = tel;
	}

	public void cadastrar() {

	}

	public void obteridade() {

	}

	public void reajustarSalario(double perc, int id) {

	}

	public void reajustarSalario() {

	}
	
	public void promover(String NovoCargo) {

	}
}