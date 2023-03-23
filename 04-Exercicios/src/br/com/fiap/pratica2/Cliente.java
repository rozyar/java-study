package br.com.fiap.pratica2;

public class Cliente {
    //Atributos
    String nome;
    String cpf;
    Endereco endereco;

    //Metodos

    String retornarDados (){
        return "Nome: " + nome + ", CPF: " + cpf + ", Endereco: " + endereco;
    }
}
