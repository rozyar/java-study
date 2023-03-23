package br.com.fiap.pratica2;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //objetos
        Cliente cliente = new Cliente();
        Endereco endereco = new Endereco();
        ContaCorrente contaCorrente = new ContaCorrente();

        //atribuindo valores aos atributos
        //cliente
        cliente.nome = "Fernando Calixto Alves";
        cliente.cpf = "123.456.789-00";
        cliente.endereco = endereco;

        //contaCorrente
        contaCorrente.saldo = 700.67;
        contaCorrente.titular = cliente;

        //endereco
        endereco.logradouro = "Rua dos Bobos";
        endereco.numero = 69;
        endereco.complemento = "Casa do Inferno";
        endereco.cep = "696969-690";

        //Leia um valor para depositar na conta corrente
        System.out.println("Digite um valor para depositar na conta corrente: ");
        double deposito = leitor.nextDouble();

        
        double calculo = contaCorrente.depositar(deposito);
        System.out.println("O valor depositado foi de: " + deposito + ", e seu novo saldo é de: " + calculo);

        //Leia um valor para retirar da conta corrente
        System.out.println("Digite um valor para retirar da conta corrente: ");
        double saque = leitor.nextDouble();

        double calculo2 = contaCorrente.retirar(saque);
        System.out.println("O valor retirado foi de: " + saque + ", e seu novo saldo é de: " + calculo2);

        //Exibir os dados do cliente
        String dados = cliente.retornarDados();
        System.out.println("Os dados do cliente são: " + dados);

    }
}
