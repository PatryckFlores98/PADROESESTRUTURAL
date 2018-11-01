package Adapter;

import java.util.HashMap;


public class AdapterMap extends HashMap {

	public AdapterMap(Object[] matriz) {
		this.put(matriz[0], matriz[1]);
	}

}
