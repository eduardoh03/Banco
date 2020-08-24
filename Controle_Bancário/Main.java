package Controle_Bancário;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static Menu mn = new Menu();
	static BancoDeDados cont = new BancoDeDados();

	public static void main(String[] args) {
		boolean a = true;
		int verifcod;
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
				System.out.println();
				break;

			case 3:// Abrir conta
				System.out.println("INFORME O CODIGO BANCARIO:");
				verifcod = sc.nextInt();

				buscarCliente(verifcod);//verifica se o codigo informado está dentro da lista
				if (buscarCliente(verifcod) == true) {
					Conta novaCont = criarConta(verifcod);					
					cont.adicionarConta(novaCont);
				} else {
					System.out.println("CODIGO INVALIDO");
				}

				break;

			case 4:// Efetuar depósito
				System.out.println("INFORME O NUMERO DA CONTA: ");
				int verfinum = sc.nextInt();
				
				buscarConta(verfinum);
				if (buscarConta(verfinum) == true) {
					System.out.println("INFORME O VALOR A SER DEPOSITADO: ");
					Double deposito = sc.nextDouble();
					depositar(deposito);
				}else {
					System.out.println("NUMERO INVALIDO");
				}
				break;

			case 5:// Efetuar saque
				System.out.println("INFORME O NUMERO DA CONTA: ");
				verfinum = sc.nextInt();
				
				buscarConta(verfinum);
				if (buscarConta(verfinum) == true) {
					System.out.println("INFORME O VALOR A SER SACADO: ");
					
				}else {
					System.out.println("NUMERO INVALIDO");
				}
				break;

			case 6:// Relatório de contas
				cont.mostrarContas();
				System.out.println();
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
	private static boolean buscarCliente(int verifcod) {
		Cliente cliente = cont.buscar(verifcod);

		if (cliente != null) {
			return true;
		} else {
			return false;
		}
	}
	private static boolean buscarConta(int verfinum) {
		Conta contra = cont.buscarCon(verfinum);
		
		if (contra != null) {
			return true;
		} else {
			return false;
		}
	}
	private static Conta criarConta(int verifcod) {
		Cliente usuario = cont.buscar(verifcod);
				
		System.out.println("INFORME O SALDO INICIAL");
		Double saldo_inicial = sc.nextDouble();
		
		System.out.println("INFORME UM NUMERO PARA CONTA:");
		int numeroConta = sc.nextInt();
		
		return new Conta(usuario.getNome(),
				usuario.getE_mail(),
				usuario.getTelefone(),
				usuario.getCodigo(), 
				saldo_inicial, 
				numeroConta);
	}
	private static Conta depositar(Double deposito) {
		
		return null;
		
	}
}
