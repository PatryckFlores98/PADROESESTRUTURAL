package bridge2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        ListaImpl listaOrdenada = new ListaOrdenada();
        listaOrdenada.adicionar("açai");
        listaOrdenada.adicionar("laranja");
        listaOrdenada.adicionar("limão");
        listaOrdenada.adicionar("água");
        listaOrdenada.adicionar("sopa");

        AbstracaoImpressao impressaoLetras = new ItensCaracteres(listaOrdenada);
        impressaoLetras.imprimeItens();

        AbstracaoImpressao impressaoNumeros = new ItensNumeradores(listaOrdenada);
        impressaoNumeros.imprimeItens();

        AbstracaoImpressao impressaoSimbolo = new ItensSimbolos(listaOrdenada);
        impressaoSimbolo.imprimeItens();

    }
}
