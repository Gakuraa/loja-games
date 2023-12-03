package loja.model;

public class Jogo extends Produto{

	private String classificacaoInd;
	private String genero;
	
	public Jogo(int id, int tipo, String nome, double preco, String classificacaoInd, String genero) {
		super(id, tipo, nome, preco);
		this.classificacaoInd = classificacaoInd;
		this.genero = genero;
	}

	public String getClassificacaoInd() {
		return classificacaoInd;
	}

	public void setClassificacaoInd(String classificacaoInd) {
		this.classificacaoInd = classificacaoInd;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Classificação Indicativa: " + getClassificacaoInd());
		System.out.println("Gênero do Jogo: " + getGenero());
		System.out.println("-------------------------------------");
	}
	
}
