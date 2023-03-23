package br.com.fiap.pratica2;

public class ContaCorrente {

    //Atributos
    double saldo;
    Cliente titular;

    //Metodos
    double depositar(double valor){
        saldo += valor;
        return saldo;
    }

    double retirar(double valor){
        saldo -= valor;
        return saldo;
    }

    void retornarSaldo(){
        System.out.println("Opa campeão esse é teu saldo " + saldo);
    }



}
