package cliente;

import carro.Carro;

import java.util.Scanner;

public class Cliente {
    Scanner sc = new Scanner(System.in);
    private String nome;
    private String sobrenome;
    private String cpf;
    private String localizacao;
    private Carro carro;
    private Cliente[] lista = new Cliente[10];
     int totalClientes = 0;



    public Cliente() {
    }

    public Cliente(String nome, String sobrenome, String cpf, String localizacao, Carro carro) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.localizacao = localizacao;
        this.carro = carro;
    }





    public void adicionarCliente(Cliente novoCliente){
        if(totalClientes <= lista.length){
            lista[totalClientes] = novoCliente;
            totalClientes ++;
        }
        else{
            System.out.println("Base de dados cheia.");
        }

    }

    public String buscarCliente(String nomeCliente){
        for(int i = 1 ; i < totalClientes; i++){
            if(lista[i].getNome().equals(nomeCliente)){
              return "O cliente pesquisado é " + nomeCliente;
            }
        }
       return "Esse cliente não existe na nossa base de dados.";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente[] getLista() {
        return lista;
    }

    public void setLista(Cliente[] lista) {
        this.lista = lista;
    }

}
