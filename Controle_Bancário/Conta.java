package Controle_Bancário;

public class Conta extends Cliente{
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
		return "Conta [Nome :" + getNome() + 
				" \nE-mail :" + getE_mail() + 
				" \nTelefone :" + getTelefone() + 
				" \nCodigo : " + getCodigo() + 
				" \nSaldo : R$" + saldo_inicial + 
				" \nNumero da conta :" + numero + "]";
	}
	
	
}

