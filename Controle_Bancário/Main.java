package Controle_Bancário;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Menu mn = new Menu();
	static BancoDeDados cont = new BancoDeDados();

	public static void main(String[] args) {
		boolean a = true;
		do {
			mn.Menu_inicial();
			int escolha = sc.nextInt();

			switch (escolha) {

			case 1:// cadastro
				Cliente novaConta = criarContato();
				cont.adicionar(novaConta);
				break;

			case 2:// listar contas
				cont.mostrarClientes();
				break;

			case 3:// Abrir conta
				System.out.println("INFORME O CODIGO DO CLIENTE:");
				int verifcod = sc.nextInt();

				buscarConta(verifcod);//verifica se o codigo informado está dentro da lista
				if (buscarConta(verifcod) == true) {
					criarConta(verifcod);
					

				} else {
					System.out.println("CODIGO INVALIDO");
				}

				break;

			case 4:// Efetuar depósito

				break;

			case 5:// Efetuar saque

				break;

			case 6:// Relatório de contas
				break;

			case 7:// Encerrar o programa
				System.out.println("--ENCERRANDO SESSAO--");
				a = false;
				break;
			default:
				break;

			}

		} while (a == true);

	}


	private static Cliente criarContato() {
		// TODO perguntar prof bug nextLine e nestInt

		System.out.println("DIGITE O NOME: ");
		sc.nextLine();
		String nome = sc.nextLine().toUpperCase();

		System.out.println("INFORME SEU E-MAIL: ");
		String e_mail = sc.nextLine().toUpperCase();

		System.out.println("INFORME SEU TELEFONE: ");
		String telefone = sc.nextLine();

		System.out.println("INFORME SEU CÓDIGO: ");
		int codigo = sc.nextInt();

		return new Cliente(nome, e_mail, telefone, codigo);
	}

	private static boolean buscarConta(int verifcod) {
		Cliente cliente = cont.buscar(verifcod);

		if (cliente != null) {
			return true;
		} else {
			return false;
		}
	}
	
	private static Conta criarConta(int verifcod) {
		Conta usuario = (Conta) cont.buscar(verifcod);
		
		System.out.println("INFORME UM NUMERO PARA CONTA:");
		int numero = sc.nextInt();
		
		System.out.println("INFORME O SALDO INICIAL");
		Double saldo_inicial = sc.nextDouble();
		
		return (Conta) new Cliente(usuario.getNome(),
				usuario.getE_mail(),
				usuario.getTelefone(),
				usuario.getCodigo()
				);
	}
	/*
	 * private static Conta criarConta(int verifcod) { Cadastro cliente =
	 * cont.buscar(verifcod);
	 * 
	 * System.out.println("INFORME O SALDO INICIAL: "); Double saldo_inicial =
	 * sc.nextDouble();
	 * 
	 * if(saldo_inicial >= 0 || saldo_inicial <=0) { return new
	 * Conta(cliente.getNome(), cliente.getE_mail(), cliente.getTelefone(),
	 * cliente.getCodigo(), saldo_inicial); } return null; }
	 */
}
