import carro.Carro;

import cliente.ClinteDAO;

import posto.PostoDAO;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String mensagemMenu = "DIGITE A OPÇÃO DESEJADA %n1- PARA CADASTRAR UM CLIENTE  %n2 - PARA CADASTRAR POSTO  %n3 - PARA LISTAR TODOS OS CLIENTES  %n4 - PARA BUSCAR CLIENTE PELO NOME %n5 - PARA EXIBIR TODOS OS POSTO %n6 - PARA BUSCAR POSTOS PELO NOME %n0 - PARA SAIR DO MENU";
		System.out.printf(mensagemMenu);
		int opcao = sc.nextInt();
		ClinteDAO cli = new ClinteDAO();
		PostoDAO pos = new PostoDAO();

		while (opcao != 0) {

			switch (opcao) {
			case 1:
				System.out.println("Você entrou na opção de cadastro de cliente.");

				// cadastro do cliente
				System.out.println("Digite seu primeiro nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Segundo nome: ");
				String sobrenome = sc.nextLine();
				System.out.println("CPF: ");
				String cpf = sc.nextLine();
				System.out.println("Endereço: ");
				String localizacao = sc.nextLine();

				// cadastro do carro
				System.out.println("Marca do carro:");
				String marca = sc.nextLine();
				System.out.println("Modelo: ");
				String modelo = sc.nextLine();
				Carro carro = new Carro(marca, modelo);
				cli.salvar(nome, sobrenome, cpf, localizacao, carro);
				break;

			case 2:
				// cadastro posto 
				System.out.println("Você entrou na opção de cadastro de posto.");
				System.out.println();
				System.out.println("Nome do Posto ");
				sc.nextLine();
				String nomePosto = sc.nextLine();
				System.out.println("CNPJ do posto: ");
				String cnpj = sc.nextLine();
				System.out.println("localização do posto: ");
				String localizacaoPosto = sc.nextLine();
				pos.salvar(nomePosto, cnpj, localizacaoPosto);
				break;
				
			case 3:
				System.out.println("Exibir TODOS clienteS ");
				cli.listarClientes();
				break;

			case 4:
				System.out.println("Digite o nome do cliente");
				String nomeP = sc.next();
				cli.buscarCliente(nomeP);
				break;
			case 5: 
				System.out.println("Exibir TODOS postos ");
				pos.listarPostos();
				break;
				
			case 6:
				System.out.println("Digite o nome do Posto");
				String buscaPosto = sc.next();
				pos.buscarPosto(buscaPosto);
				break;	
				
			default:
				System.out.println("Opção Invalida!");
				System.out.printf(mensagemMenu);
				opcao = sc.nextInt();
				break;
			}
			System.out.printf(mensagemMenu);
			opcao = sc.nextInt();
		}
		System.out.println("Programa encerrado! Obrigado por utiliza-lo.");
	}
}
