package exercici2;

public class MainCoche {

	public static void main(String[] args) {
		//Llamando al método estático
		Coche.frenar();
		
		//Llamando a un método no estático
		Coche coche1 = new Coche();
		coche1.acelerar();
	}
}


