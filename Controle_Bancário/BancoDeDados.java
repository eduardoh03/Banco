package Controle_Bancário;

import java.util.List;

import java.util.ArrayList;

public class BancoDeDados {
	
	private List<Cliente> clienteBd = new ArrayList<>();
	private List<Conta> contaBd = new ArrayList<>();
	
	// adicionar cliente
	void adicionar(Cliente conta) {
		getClienteBd().add(conta);
	}
	// adicionar conta
	void adicionarConta(Conta conta2) {
		getContaBd().add(conta2);
	}
	// mostrar contatos.
	void mostrarClientes() {
		for (Cliente cadastro : getClienteBd()) {
			System.out.println("\n[" + getClienteBd().indexOf(cadastro) + "]");
			System.out.println(cadastro);
		}
	}
	void mostrarContas() {
		for (Conta cont : getContaBd()) {
			System.out.println("\n[" + getContaBd().indexOf(cont) + "]");
			System.out.println(cont);
		}
	}

	// verificar codigo.
	Cliente buscar(int verifcod) {
		for (Cliente cadastro : getClienteBd()) {
			if (cadastro.getCodigo() == verifcod) {
				return cadastro;
			}
		}
		return null;
	}
	Conta buscarCon(int verfinum) {
		for (Conta client : getContaBd()) {
			if (client.getNumero() == verfinum) {
				return client;
			}
		}
		return null;
	}	
	
	public List<Cliente> getClienteBd() {
		return clienteBd;
	}
	public List<Conta> getContaBd() {
		return contaBd;
	}
	public void setContaBd(List<Conta> contaBd) {
		this.contaBd = contaBd;
	}
	/**
	 * @param clienteBd the clienteBd to set
	 */
	public void setClienteBd(List<Cliente> clienteBd) {
		this.clienteBd = clienteBd;
	}
	

}
