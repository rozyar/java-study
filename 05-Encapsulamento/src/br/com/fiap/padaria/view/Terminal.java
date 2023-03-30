package br.com.fiap.padaria.view;

import br.com.fiap.padaria.model.Produto;

public class Terminal {

	//Criar o método: main + CTRL + espaco
	public static void main(String[] args) {
		//Instanciar um produto
		Produto banana = new Produto();
		
		//Definir o nome do produto
		banana.setId(1);
		banana.setName("Banana");
		banana.setPrecoCusto(1.50);
		banana.setPrecoVenda(5);
		banana.setPromocao(true);
		
		
		//Exibir o nome do produto
		System.out.println("O nome do produto é: " + banana.getName());
		
		//Exibir id
		System.out.println("O id do produto é: " + banana.getId());
		
		//Exibir preco custo
		System.out.println("O preço do custo do produto é: " + banana.getPrecoCusto());
		
		//Exibir preco de venda
		System.out.println("O preço de venda é: " + banana.getPrecoVenda());
		
		//Exibir estado da promoção do produto
		if (banana.getPromocao() == false) {
			System.out.println("A Banana não esta em promoção");
		}else {
			System.out.println("A " + banana.getName() + " está em promoção");
		}
		
		//atualizar estoque banana
		banana.atualizarEstoque(100);
		
		//mostrar estoque
		System.out.println(banana.getQuantidade());
		
		//calcular lucro
		double lucro = banana.calcularLucro();
		
		//mostrar lucro
		System.out.println("Seu lucro é de: " + lucro);
	}
}
