import carro.Carro;
import cliente.Cliente;
import posto.Posto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mensagemMenu = "DIGITE 1 PARA CADASTRAR UM CLIENTE | 2 - PARA CADASTRAR POSTO | 0 - PARA SAIR DO MENU";
        System.out.println(mensagemMenu);
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você entrou na opção de cadastro de cliente.");

                //cadastro do cliente
                System.out.println("Digite seu primeiro nome: ");
                sc.nextLine();
                String nome = sc.nextLine();
                System.out.println("Segundo nome: ");
                String sobrenome = sc.nextLine();
                System.out.println("CPF: ");
                String cpf = sc.nextLine();
                System.out.println("Localizacao: ");
                String localizacao = sc.nextLine();

                //cadastro do carro
                System.out.println("Marca do carro:");
                String marca = sc.nextLine();
                System.out.println("Modelo: ");
                String modelo = sc.nextLine();
                Carro carro = new Carro(marca, modelo);
                Cliente cliente = new Cliente(nome, sobrenome, cpf, localizacao, carro);
                cliente.adicionarCliente(cliente);

                //cadastro do cliente
                System.out.println("Cliente 2");
                System.out.println("Digite seu primeiro nome: ");
                String nome2 = sc.nextLine();
                System.out.println("Segundo nome: ");
                String sobrenome2 = sc.nextLine();
                System.out.println("CPF: ");
                String cpf2 = sc.nextLine();
                System.out.println("Localizacao: ");
                String localizacao2 = sc.nextLine();

                //cadastro do carro
                System.out.println("Marca do carro:");
                String marca2 = sc.nextLine();
                System.out.println("Modelo: ");
                String modelo2 = sc.nextLine();
                Carro carro2 = new Carro(marca, modelo);
                Cliente cliente2 = new Cliente(nome2, sobrenome2, cpf2, localizacao2, carro2);
                cliente.adicionarCliente(cliente2);

                cliente.buscarCliente("teste");
                System.out.println(mensagemMenu);
                opcao = sc.nextInt();
            case 2:
                System.out.println("Você entrou na opção de cadastro de posto.");
                System.out.println();
                System.out.println("Nome do Posto ");
                sc.nextLine();
                String nomePosto = sc.nextLine();
                System.out.println("localização do posto: ");
                String localizacaoPosto = sc.nextLine();
                Posto posto = new Posto(nomePosto, localizacaoPosto);
                System.out.println(mensagemMenu);
                opcao = sc.nextInt();
                break;

            default:
                System.out.println("Opção Invalida!");
                System.out.println(mensagemMenu);
                opcao = sc.nextInt();
                break;
        }
        System.out.println("Programa encerrado! Obrigado por utiliza-lo.");
    }
}
