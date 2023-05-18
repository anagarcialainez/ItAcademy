package exercici1;

public class InstrumentoCuerda extends Instrumento {
	
	public InstrumentoCuerda(String nombre,int precio) {
		super(nombre,precio);
	}
	void tocar() {
		System.out.println("Está sonando un instrumento de cuerda. Nombre: " + getNombre()+ " y Precio:" + getPrecio());
	}

}