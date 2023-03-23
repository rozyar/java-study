package br.com.fiap.media.aluno;

public class Aluno {
	//Atributos
	String nome;
	
	double cp1;
	
	double cp2;
	
	double cp3;
	
	double challenge;
	
	double global;
	
	//Metodos
	
	double calcularMediaCheckpoints(){
		double mediaCheckpoints = (cp1 + cp2 + cp3)/3;
		return mediaCheckpoints;
	}
	
	double calcularMediaSemestre() {
		double mediaCp = calcularMediaCheckpoints();
		double churros = mediaCp;
		double mediaSemestre = (churros * 0.2 + challenge * 0.2 + global * 0.6);
		return mediaSemestre;
	}
}

