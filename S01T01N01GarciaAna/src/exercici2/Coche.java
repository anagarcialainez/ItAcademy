package exercici2;

public class Coche {
	static final String marca = "Mazda"; //todos los objetos de la clase tendrán el mismo valor y este no se podrá modificar
	static String modelo; 
	final int potencia = 120;	
	
	
	public static void frenar() {
		System.out.println("El vehículo está frenando");
	}
	public void acelerar(){
		System.out.println("El vehículo está acelerando");
	}
	
}
