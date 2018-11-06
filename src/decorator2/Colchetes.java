package decorator2;

public class Colchetes extends NumeroUmDecorator {
    NumeroUm novonumeroUm;

    public Colchetes(NumeroUm novonumeroUm) {
        super(novonumeroUm);
    }

    @Override
    public String imprimir(){
        return "[" + super.imprimir()+ "]";
    }
}
