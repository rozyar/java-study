package br.com.fiap.pratica2;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Data date = new Data();
		
		System.out.println("Escreva o dia: ");
		int dia = reader.nextInt();
				
		System.out.println("Escreva o mes: ");
		int mes = reader.nextInt();
				
		System.out.println("Escreva o ano: ");
		int ano = reader.nextInt();
		
		date.atribuirDia(dia);
		date.atribuirMes(mes);
		date.atribuirAno(ano);
		
		System.out.println(date.retornarData());
		
	}
}
