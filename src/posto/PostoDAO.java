package posto;

import carro.Carro;

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
