package br.com.fiap.pratica2;

public class Endereco {
    //Atributos
    String logradouro;
    short numero;
    String complemento;
    String cep;

    //Metodos
    String retornarEndereco(){
        return logradouro + ", " + numero + ", " + complemento + ", " + cep;
    }
}
