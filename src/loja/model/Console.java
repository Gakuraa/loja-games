package loja.model;

public class Console extends Produto{
	
	private int capacidade;
	private String tipoConsole;

	public Console(int id, int tipo, String nome, double preco, int capacidade, String tipoConsole) {
		super(id, tipo, nome, preco);
		this.capacidade = capacidade;
		this.tipoConsole = tipoConsole;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getTipoConsole() {
		return tipoConsole;
	}

	public void setTipoConsole(String tipoConsole) {
		this.tipoConsole = tipoConsole;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Capacidade de Armazenamento: " + getCapacidade() + " GB");
		System.out.println("Tipo de Console: " + getTipoConsole());
		System.out.println("-------------------------------------");
	}

}
