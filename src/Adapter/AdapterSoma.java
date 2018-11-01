package Adapter;

import java.util.List;
import java.util.ArrayList;

public class AdapterSoma implements SomadorEsperado{

	List<Integer> lista;
	private SomadorExistente somadorEsperado;
	
	public AdapterSoma(SomadorExistente somador) {
		this.somadorEsperado = somador;
	}
	
	@Override	
	//o cliente espera usar uma classe que soma inteiros em um vetor	
	public int somaVetor(int[] vetor) {
		for (int i=0; i<vetor.length; i++) {
			lista.add(vetor[i]);
		}
		
		int resultado = somadorEsperado.somaLista(lista);		
		return resultado;		
	}

}
