package exercici1;

public class InstrumentoPercusion extends Instrumento {
	
	public InstrumentoPercusion(String nombre,int precio) {
		super(nombre,precio);
	} 
	void tocar() {
		System.out.println("Está sonando un instrumento de percusión. Nombre: " + getNombre()+ " y Precio:" + getPrecio());
	}
}
