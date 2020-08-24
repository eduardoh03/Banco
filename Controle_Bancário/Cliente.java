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

	/*class Conta extends Cadastro{
		private Double saldo_inicial;
		private int numero;

		public Conta(String nome, String e_mail, String telefone, int codigo, Double saldo_inicial, int numero) {
			super(nome, e_mail, telefone, codigo);
			this.saldo_inicial = saldo_inicial;
			this.numero = numero;
		}
		public Double getSaldo_inicial() {
			return saldo_inicial;
		}
		public void setSaldo_inicial(Double saldo_inicial) {
			this.saldo_inicial = saldo_inicial;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		@Override
		public String toString() {
			return "Conta [Nome :" + nome + 
					", E-mail :" + e_mail + 
					", Telefone :" + telefone + 
					", Codigo=" + codigo
					+ ", Saldo Inicial=" + saldo_inicial + 
					", Numero da conta :" + numero + "]";
		}
		
		
	}*/

}
