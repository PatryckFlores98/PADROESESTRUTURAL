package composite1;

public class Main {

	
	public static void main(String[] args) {
        //Inicializa quatro elipses
        Ellipse ellipse1 = new Ellipse();
        Ellipse ellipse2 = new Ellipse();
        Ellipse ellipse3 = new Ellipse();
        Ellipse ellipse4 = new Ellipse();

      

        //Faz o grafico
        ellipse1.add(ellipse1);
        ellipse2.add(ellipse2);
        ellipse3.add(ellipse3);

        ellipse4.add(ellipse4);

      
    }
	
	
	
}
