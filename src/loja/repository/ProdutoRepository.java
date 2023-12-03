package loja.repository;

import loja.model.Produto;

public interface ProdutoRepository {
	
	public void criar (Produto produto);
	
	public void listarTodas ();
	
	public Produto atualizar (int id, Produto produto);
	
	public Produto buscarPorId (int id);
	
	public void excluir (int id);

}
