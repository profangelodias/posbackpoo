package aula03_Pessoa;

public class Pessoa {
	private String nome;
	private int data;
	private String end;
	private String tel;
	private String cargo;
	
	public Pessoa(String nome, int data, String end, String tel, String cargo) {
		this.nome = nome;
		this.cargo = cargo;
		this.data = data;
		this.end = end;
		this.tel = tel;
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



	public String getTel() {
		return tel;
	}



	public void setTel(String tel) {
		this.tel = tel;
	}



	public String getCargo() {
		return cargo;
	}



	public void setCargo(String cargo) {
		this.cargo = cargo;
	}



	public void cadastrar() {

	}

	public void obteridade() {

	}

	public void reajustarSalario(double perc) {

	}
	
	public void promover(String NovoCargo) {

	}
}