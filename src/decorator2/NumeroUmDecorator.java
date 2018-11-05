package decorator2;

public class NumeroUmDecorator extends NumeroUm{
    private NumeroUm numeroUm;


    public NumeroUmDecorator(NumeroUm novonumeroUm){
        numeroUm = novonumeroUm;
    }

    @Override
    public int imprimir(){
        return numeroUm.imprimir();
    }
}

