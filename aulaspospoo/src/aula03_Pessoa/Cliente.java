package aula03_Pessoa;

public class Cliente extends Pessoa{
	
	private int codigo;
	private String profissao;

	public Cliente(String nome, int data, String end, Telefone tel, int codigo, String profissao) {
		super(nome, data, end, tel);
		this.codigo = codigo;
		this.profissao = profissao;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	public void melhorCliente(String Badge) {
		
	}

}
