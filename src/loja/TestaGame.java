package loja;

import java.util.InputMismatchException;
import java.util.Scanner;

import loja.controller.ProdutoController;
import loja.model.Console;
import loja.model.Jogo;

public class TestaGame {

	public static void main(String[] args) {

		int op, tipo, capacidade, id;
		String nome, tipoConsole, classificacaoInd, genero;
		double preco;
		Scanner sc = new Scanner(System.in);
		ProdutoController produtos = new ProdutoController();

		do {
			System.out.println("-----------------------------------");
			System.out.println("          Loja Gamers              ");
			System.out.println("-----------------------------------");
			System.out.println("1. Cadastrar Produto");
			System.out.println("2. Listar Produtos");
			System.out.println("3. Visualizar Produto por ID");
			System.out.println("4. Atualizar Produto");
			System.out.println("5. Excluir Produto");
			System.out.println("0. Sair");
			System.out.println("-----------------------------------");
			System.out.print("\nEscolha a opção desejada: \n");

			op = sc.nextInt();
			sc.nextLine();
			switch (op) {
			case 1:
				System.out.println("1-Cadastrar Console ou 2-Cadastrar um Jogo");
				tipo = sc.nextInt();
				sc.nextLine();
				System.out.println("Digite o nome do Produto: ");
				nome = sc.nextLine();
				System.out.println("Digite o valor do Produto: ");
				preco = sc.nextDouble();
				if (tipo == 1) {
					sc.nextLine();
					System.out.println("Digite a capacidade do Console: ");
					capacidade = sc.nextInt();
					sc.nextLine();
					System.out.println("Digite o tipo do Console " + nome);
					tipoConsole = sc.nextLine();
					produtos.criar(new Console(produtos.gerarId(), tipo, nome, preco, capacidade, tipoConsole));
					;
				} else if (tipo == 2) {
					sc.nextLine();
					System.out.println("Digite a classificação indicativa: ");
					classificacaoInd = sc.nextLine();
					System.out.println("Digite o gênero do jogo: ");
					genero = sc.nextLine();
					produtos.criar(new Jogo(produtos.gerarId(), tipo, nome, preco, classificacaoInd, genero));
				} else {
					System.out.println("Opção inválida!");
				}
				break;
			case 2:
				System.out.println("Lista de todos produtos em estoque: \n");
				produtos.listarTodas();
				break;
			case 3:
				System.out.println("Digite o ID do produto que deseja visualizar: ");
				id = sc.nextInt();
				produtos.buscarPorId(id);
				break;
			case 4:
				System.out.println("Digite o ID do produto que deseja atualizar: ");
				id = sc.nextInt();
				System.out.println("Dados do produto que será atualizado: ");
				var buscarId = produtos.buscarPorId(id);
				if (buscarId != null) {
					System.out.println("\n1-Cadastrar Console ou 2-Cadastrar um Jogo");
					tipo = sc.nextInt();
					sc.nextLine();
					System.out.println("Digite o nome do Produto: ");
					nome = sc.nextLine();
					System.out.println("Digite o valor do Produto: ");
					preco = sc.nextDouble();
					if (tipo == 1) {
						sc.nextLine();
						System.out.println("Digite a capacidade do Console: ");
						capacidade = sc.nextInt();
						sc.nextLine();
						System.out.println("Digite o tipo do Console " + nome);
						tipoConsole = sc.nextLine();
						produtos.atualizar(id, new Console(id, tipo, nome, preco, capacidade, tipoConsole));
						;
					} else if (tipo == 2) {
						sc.nextLine();
						System.out.println("Digite a classificação indicativa: ");
						classificacaoInd = sc.nextLine();
						System.out.println("Digite o gênero do jogo: ");
						genero = sc.nextLine();
						produtos.atualizar(id, new Jogo(id, tipo, nome, preco, classificacaoInd, genero));
					} else {
						System.out.println("Opção inválida!");
					}
				}
				break;
			case 5:
				System.out.println("Digite o ID do produto que deseja deletar: ");
				id = sc.nextInt();
				produtos.excluir(id);
				break;
			case 0:
				System.out.println("Saindo do programa. Até logo!");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");

				try {
					op = sc.nextInt();
				} catch (InputMismatchException e) {
					System.out.println("\nDigite valores inteiros!");
					sc.nextLine();
					op = 0;
				}
			}
		} while (op != 0);
		if (op == 0) {
			System.out.println("\nObrigado utilizar o sistema, volte sempre!");
			sc.close();
			System.exit(0);
		}

	}

}
