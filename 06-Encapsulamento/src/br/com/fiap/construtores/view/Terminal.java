package br.com.fiap.construtores.view;

import java.util.function.BiConsumer;

import br.com.fiap.construtores.model.Bicicleta;
import br.com.fiap.construtores.model.Fabricante;

public class Terminal {
    public static void main(String[] args) {
        //Insanciar um fabricante
        Fabricante fab = new Fabricante();

        fab.setNome("Caloi");
        fab.setCpf("123.456.789-00");


        // INtsnaciar uma bicilceta
        Bicicleta bike = new Bicicleta();
        bike.setModelo("Velox");
        bike.setAro(20);
        bike.setPeso(10);
        bike.setFabricante(fab);

        

        // Imprimir os dados da bicicleta
        System.out.println(bike.retornarDetalhes());
    }
}
