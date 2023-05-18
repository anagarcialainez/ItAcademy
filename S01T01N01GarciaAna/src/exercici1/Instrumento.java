package exercici1;

public abstract class Instrumento {
	private String nombre;
	private int precio;

	public Instrumento(String nombre, int precio) {
		this.nombre = nombre;
		this.precio = precio;
	}

	public static void main(String[] args) {
		InstrumentoViento viento1 = new InstrumentoViento("trompeta", 80);
		viento1.tocar();
		InstrumentoCuerda cuerda1 = new InstrumentoCuerda("guitarra", 100);
		cuerda1.tocar();
		InstrumentoPercusion percusion1 = new InstrumentoPercusion("bombo", 250);
		percusion1.tocar();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	abstract void tocar();

}
