package loja.model;

public abstract class Produto {
	
	private int id;
	private int tipo;
	private String nome;
	private double preco;
	
	public Produto(int id, int tipo, String nome, double preco) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.nome = nome;
		this.preco = preco;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	public void visualizar() {
		System.out.println("ID: " + getId());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Nome: " + getNome());
		System.out.println("Preço: " + getPreco() + " reais");
	}
	
}
