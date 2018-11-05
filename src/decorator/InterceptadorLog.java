package decorator;

import java.util.Calendar;

class InterceptadorLog implements Componente {
	private Componente componente;

	public InterceptadorLog(Componente componente) {
		this.componente = componente;
	}

	public void executarTarefa() throws InterruptedException {
		Calendar c = Calendar.getInstance();
		int dia = c.get(Calendar.DAY_OF_MONTH);
		int hora = c.get(Calendar.HOUR_OF_DAY);		
		System.out.println("Log registrado, no dia" + dia + ", às " + hora);
		long antes = System.currentTimeMillis();
		componente.executarTarefa();
		long depois = System.currentTimeMillis();
		System.out.println((depois - antes) + " ms");
	}


}
