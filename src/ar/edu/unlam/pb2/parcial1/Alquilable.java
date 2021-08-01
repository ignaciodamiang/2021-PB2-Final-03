package ar.edu.unlam.pb2.parcial1;

public abstract class Alquilable extends Producto{

	private Double precioAlquiler;

	public Alquilable(Integer codigo, String descripcion) {
		super(codigo, descripcion);
	}

	public void setPrecioAlquiler(Double precioAlquiler) {
		this.precioAlquiler=precioAlquiler;
	}

	public Double getPrecioAlquiler() {
		return precioAlquiler;
	}

}
