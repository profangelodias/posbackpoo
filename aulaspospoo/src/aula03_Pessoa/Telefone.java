package aula03_Pessoa;

public class Telefone {
	private String numero;
	private String tipo;
	private Telefone telefone;
	
	
	public Telefone(String numero, String tipo) {
		telefone.numero = numero;
		telefone.tipo = tipo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Telefone getTelefone() {
		return telefone;
	}
	
	
	
	

}
