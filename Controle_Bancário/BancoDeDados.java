package Controle_Bancário;

import java.util.List;

import java.util.ArrayList;

public class BancoDeDados {
	
	private List<Cliente> clienteBd = new ArrayList<>();
	private List<Conta> contaBd = new ArrayList<>();
	//buscar codigo na lista
	void procurar() {
		for (int i = 0; i < clienteBd.size(); i++) {
			verifcod = clienteBd.indexOf(verifcod);
		}
	}
	// adicionar cliente
	void adicionar(Cliente conta) {
		clienteBd.add(conta);
	}

	// mostrar contatos.
	void mostrarClientes() {
		for (Cliente cadastro : clienteBd) {
			System.out.println("\n[" + clienteBd.indexOf(cadastro) + "]");
			System.out.println(cadastro);
		}
	}

	// verificar codigo.
	Cliente buscar(int verifcod) {
		for (Cliente cadastro : clienteBd) {
			if (cadastro.getCodigo() == verifcod) {
				return cadastro;
			}
		}
		return null;
	}
	public void cadastrar(Double saldo_inicial, int numero) {
		
		
	}
	

}
