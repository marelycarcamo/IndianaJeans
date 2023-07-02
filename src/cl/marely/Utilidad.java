package cl.marely;


public class Utilidad {
	
	public void tiempoEspera(String mensaje, int sleepTimer) {
		System.out.print("\n\n\t\t" + mensaje + "");
		for (int i = 0; i < 10; i++) {
			try {
				System.out.print(".");
				Thread.sleep(sleepTimer);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}


	public void mensaje(String msje) {
		System.out.println("\n\n\t---------------------------------------------------------------------------------------------------");
		System.out.println("                        < < < " + msje + " > > >");
		System.out.println("\t----------------------------------------------------------------------------------------------------\n\n\n\n\n");
	}
	
	
	public void limpiezaPantalla () {
		
	}
	
	
}
