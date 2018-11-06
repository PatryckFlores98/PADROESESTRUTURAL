package bridge2;
import java.util.LinkedList;

public class ListaOrdenada implements ListaImpl {
        private LinkedList<String> lista;
        private int i=0;


    public ListaOrdenada(){
        lista = new LinkedList();
    }

    @Override
    public void adicionar(String s) {

        lista.add(s);
        lista.sort(String::compareTo);
    }

    @Override
    public void imprimir() {
        System.out.println(lista.get(i));
        i=i+1;
        if(i==5)i=0;
    }
}
