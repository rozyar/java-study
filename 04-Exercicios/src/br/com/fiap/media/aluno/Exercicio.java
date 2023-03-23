package br.com.fiap.media.aluno;

import java.util.Scanner;

public class Exercicio {
	public static void main(String[] args) {
		//instanciar o objeto para ler o teclado
		Scanner leitor = new Scanner(System.in);
		
		//instanciar um aluno
		Aluno aluno = new Aluno();
		
		//Ler o nome do aluno
		System.out.println("Digite o nome do aluno");
		aluno.nome = leitor.next();
		
		//Ler as notas do aluno
		System.out.println("Digite a nota do cp1");
		aluno.cp1 = leitor.nextDouble();
		
		System.out.println("Digite a nota do cp2");
		aluno.cp2 = leitor.nextDouble();
		
		System.out.println("Digite a nota do cp3");
		aluno.cp3 = leitor.nextDouble();
		
		System.out.println("Digite a nota do challenge");
		aluno.challenge = leitor.nextDouble();
		
		System.out.println("Digite a nota do global");
		aluno.global = leitor.nextDouble();
		
		//Calcular a media semestral do aluno
		double media = aluno.calcularMediaSemestre();
		System.out.println("A media semestral é" + media);
		
		//Calcular media checkpoints
		double mediaCp = aluno.calcularMediaCheckpoints();
		System.out.println("A media dos Checkpoints é" + mediaCp);
		
	}
	
}
