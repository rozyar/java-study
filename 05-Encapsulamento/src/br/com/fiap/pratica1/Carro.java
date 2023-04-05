package br.com.fiap.pratica1;

public class Carro {
	private String modelo;
	private int quantidadeDeLugares;
	private int quantidadePortas;
	private double comprimento;
	private int anoFabricacao;
	private Cor cor;
	private String placa;
	private float motor = 1;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getQuantidadeDeLugares() {
		return quantidadeDeLugares;
	}
	public void setQuantidadeDeLugares(int quantidadeDeLugares) {
		this.quantidadeDeLugares = quantidadeDeLugares;
	}
	public int getQuantidadePortas() {
		return quantidadePortas;
	}
	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	public double getComprimento() {
		return comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public Cor getCor() {
		return cor;
	}
	public void setCor(Cor cor) {
		this.cor = cor;
	}
	public float getMotor() {
		return motor;
	}
	public void setMotor(float motor) {
		this.motor = motor;
	}


}


