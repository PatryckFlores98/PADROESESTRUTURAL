package bridge;

public class Main {

	public static void main(String[] args) {

		//PEPSI
		ImplementacaoRefrigerante pepsiTwist = new Pepsi();
		AbstracaoTamanho tamanhoPepsi = new TamanhoGrande(pepsiTwist);
		
		tamanhoPepsi.beber();
		
		//FANTA
		ImplementacaoRefrigerante fantaLaranja = new Pepsi();
		AbstracaoTamanho tamanhoFanta = new TamanhoGrande(fantaLaranja);
		
		tamanhoFanta.beber();		
		
		//COCA
		ImplementacaoRefrigerante cocaLight = new CocaCola();
		AbstracaoTamanho tamanhoCoca = new TamanhoGrande(cocaLight);
		
		tamanhoCoca.beber();		

		//TAMANHOS DIFERENTES
		AbstracaoTamanho tamanhoPepsi2 = new TamanhoMedio(pepsiTwist);
		AbstracaoTamanho tamanhoCoca2 = new TamanhoFamilia(cocaLight);
		
		tamanhoCoca2.beber();
		tamanhoPepsi2.beber();
		
	}

}
