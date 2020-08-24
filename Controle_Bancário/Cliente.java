package Controle_Bancário;

public class Cliente {
	String nome;
	String e_mail;
	String telefone;
	int codigo;


	public Cliente(String nome, String e_mail, String telefone, int codigo) {
		this.nome = nome;
		this.e_mail = e_mail;
		this.telefone = telefone;
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Nome : " + nome + ", "
				+ "E-mail : " + e_mail + ", "
				+ "Telefone : " + telefone + ", "
				+ "Codigo Bancario : " + codigo + "";
	}

}
