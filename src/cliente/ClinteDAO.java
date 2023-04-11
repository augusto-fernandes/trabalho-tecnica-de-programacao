package cliente;

import carro.Carro;

import java.util.Scanner;

public class ClinteDAO {
    Cliente[] lista = new Cliente[10];
    int totalClientes;

    public void salvar(String nome, String sobrenome, String cpf, String localizacao, Carro carro) {
        Cliente cli = new Cliente();
        cli.setNome(nome);
        cli.setSobrenome(sobrenome);
        cli.setCpf(cpf);
        cli.setLocalizacao(localizacao);
        cli.setCarro(carro);
        adicionarCliente(cli);
    }

    public void adicionarCliente(Cliente novoCliente) {

        if (totalClientes < lista.length) {
            lista[totalClientes] = novoCliente;
            totalClientes++;
        } else {
            System.out.println("Base de dados cheia.");
        }

    }

    public String editarCliente(String edit){
        for (int i = 0; i < totalClientes; i++) {
            Scanner sc = new Scanner(System.in);
            if (lista[i].getNome().equals(edit)) {
                System.out.println("novo nome do cliente: ");
                String novoNome = sc.nextLine();
                lista[i].setNome(novoNome);
                System.out.println("O novo nome do cliente é " + lista[i].getNome());
                return"";
            }
        }
        System.out.println( "Esse cliente não existe na nossa base de dados.");
        return "";
    }

    public void excluirCliente(String delete){
        for (int i = 0; i < totalClientes; i++) {
            if (lista[i].getNome().equals(delete)) {
                lista[i].setCarro(null);
                lista[i].setCpf(null);
                lista[i].setNome(null);
                lista[i].setLocalizacao(null);
                lista[i].setSobrenome(null);
                totalClientes --;
                System.out.println("O cliente foi deletado!");
            }
        }
    }

    public String buscarCliente(String nomeCliente) {
        for (int i = 0; i < totalClientes; i++) {
            if (lista[i].getNome().equals(nomeCliente)) {
                System.out.println("O cliente pesquisado é " + lista[i].getNome());
                return "";
            }
        }
        System.out.println("Esse cliente não existe na nossa base de dados.");
        return "";
    }

    public void listarClientes() {
        for (int i = 0; i < totalClientes; i++) {
            System.out.println("Nome: " + lista[i].getNome()
                    + " Sobrenome: " + lista[i].getSobrenome()
                    + " CPF: " + lista[i].getCpf()
                    + " Endereço:" + lista[i].getLocalizacao()
            );
        }
    }
}
