package loja.controller;

import java.util.ArrayList;
import java.util.List;

import loja.model.Produto;
import loja.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private List<Produto> listaProduto = new ArrayList<Produto>();

	int id = 0;

	@Override
	public void criar(Produto produto) {
		listaProduto.add(produto);

	}

	@Override
	public void listarTodas() {
		for (var item : listaProduto) {
			item.visualizar();
		}
	}

	@Override
	public Produto atualizar(int id, Produto produto) {
		for (Produto item : listaProduto) {
			if (item.getId() == id) {
				return listaProduto.set(listaProduto.indexOf(item), produto);
			}
		}
		System.out.println("Produto com ID " + id + " não encontrado.");
		return null;
	}

	@Override
	public Produto buscarPorId(int id) {
		for (Produto item : listaProduto) {
			if (item.getId() == id) {
				item.visualizar();
				return item;
			}
		}
		System.out.println("Produto com ID " + id + " não encontrado.");
		return null;
	}

	@Override
	public void excluir(int id) {
		for (Produto item : listaProduto) {
			if (item.getId() == id) {
				listaProduto.remove(item);
				System.out.println("Produto com ID " + id + " removido com sucesso!\n");
				return;
			}
		}
		System.out.println("Produto com ID " + id + " não encontrado.");

	}

	public int gerarId() {
		return ++id;
	}

}
