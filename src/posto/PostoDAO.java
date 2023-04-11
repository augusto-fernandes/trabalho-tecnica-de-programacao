package posto;

import carro.Carro;

import java.util.Scanner;

public class PostoDAO {

	private Posto[] listaPosto = new Posto[10];
	int totalPostos;

	public void salvar(String nome, String cnpj, String localizacao) {
		Posto pos = new Posto();
		pos.setNome(nome);
		pos.setCnpj(cnpj);
		pos.setLocalizacao(localizacao);

		adicionarPosto(pos);
	}

	public void adicionarPosto(Posto novoPosto) {

		if (totalPostos < listaPosto.length) {
			listaPosto[totalPostos] = novoPosto;
			totalPostos++;
		} else {
			System.out.println("Base de dados cheia.");
		}
	}
	public void excluirPosto(String delete) {
		for (int i = 0; i < totalPostos; i++) {
			if (listaPosto[i].getNome().equals(delete)) {
				listaPosto[i].setNome(null);
				listaPosto[i].setLocalizacao(null);
				listaPosto[i].setCnpj(null);
				totalPostos --;
				System.out.println("O posto foi deletado!");
			}
		}
	}

	public String editarPosto(String edit){
		for (int i = 0; i < totalPostos; i++) {
			Scanner sc = new Scanner(System.in);
			if (listaPosto[i].getNome().equals(edit)) {
				String novoNome = sc.nextLine();
				listaPosto[i].setNome(novoNome);
				System.out.println("O novo nome do posto é " + listaPosto[i].getNome());
				return"";
			}
		}
		System.out.println( "Esse cliente não existe na nossa base de dados.");
		return "";
	}

	public String buscarPosto(String nomePosto) {
		for (int i = 0; i < totalPostos; i++) {
			if (listaPosto[i].getNome().equals(nomePosto)) {
				System.out.println("O Posto pesquisado é " + listaPosto[i].getNome());
				return"";
			}
		}
		System.out.println( "Esse cliente não existe na nossa base de dados.");
		return "";
	}

	public void listarPostos() {
		for (int i = 0; i < totalPostos; i++) {
			System.out.println("Nome: " + listaPosto[i].getNome() + "Localização: " + listaPosto[i].getLocalizacao());
		}
	}
}
