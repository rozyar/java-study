package br.com.fiap.padaria.model;

public class Produto {
	//Aributos
	private int id;
	private String name;
	private double precoCusto;
	private double precoVenda;
	private int quantidade;
	private boolean promocao;
	
	//setters e getters
	//id
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	//name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//precoCusto
	public double getPrecoCusto() {
		return precoCusto;
	}
	
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	//precoVenda 
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public void setPrecoVenda(double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	//promocao
	public boolean getPromocao() {
		return promocao;
	}
	
	public void setPromocao(boolean promocao) {
		this.promocao = promocao;
	}
	
	//quantidade
	public int getQuantidade() {
		return quantidade;
	}
	
	//metodos
	public double calcularLucro() {
		double churros = precoVenda - precoCusto;
		return churros;
	}
	
	public void atualizarEstoque(int qtd) {
		quantidade += qtd;
	}
	
}