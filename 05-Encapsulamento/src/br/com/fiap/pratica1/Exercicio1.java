package br.com.fiap.pratica1;

public class Exercicio1 {
	public static void main(String[] args) {
	//Instanciar uma Cor
		Cor roxo = new Cor();
		roxo.alterarCor(128, 0, 128, "Roxo");
		roxo.setNome("Roxo");
		
	//instanciar uma Lancha
		Lancha camaro = new Lancha();
		camaro.setAnoFabricacao(2020);
		camaro.setComprimento(10);
		camaro.setCor(roxo);
		camaro.setModelo("Azimut");
		camaro.setQuantidadeDeLugares(8);
		camaro.setQuantidadeMotores(2);
	
	//Exibir alguns valores da lancha
		System.out.println(camaro.getModelo() + "Ano de fabricação: " + camaro.getAnoFabricacao());
		
		System.out.println(camaro.getCor().getNome());
	}
	
	
}
