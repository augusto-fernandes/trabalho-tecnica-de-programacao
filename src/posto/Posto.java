package posto;

public class Posto {

    private String nome;
    private  String localizacao;
    private String cnpj;

    private Posto[] postos = new Posto[10];
    int totalPostos = 0;

    

    public void adicionarPosto(Posto novoPosto){
        if(totalPostos <= postos.length){
            postos[totalPostos] = novoPosto;
            totalPostos ++;
        }
        else{
            System.out.println("Lista de Posto cheia!");
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Posto[] getPostos() {
        return postos;
    }

    public void setPostos(Posto[] postos) {
        this.postos = postos;
    }

    public int getTotalPostos() {
        return totalPostos;
    }

    public void setTotalPostos(int totalPostos) {
        this.totalPostos = totalPostos;
    }

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
    
}
