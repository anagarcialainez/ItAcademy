package exercici1;

public class InstrumentoViento extends Instrumento {
	
	public InstrumentoViento(String nombre, int precio) {
		super(nombre,precio);
	} 

	void tocar(){
		System.out.println("Está sonando un instrumento de viento. Nombre: " + getNombre()+ " y Precio:" + getPrecio());
	}

}
