package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Producto extends Vendible{

	private Estado estadoActual;
	private Cliente quienPoseeElProducto;

	public Producto(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		this.setEstadoActual(Estado.DISPONIBLE);
	}

	public Estado getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(Estado estado) {
		this.estadoActual = estado;
	}

	public Cliente getQuienPoseeElProducto() {
		return this.quienPoseeElProducto;
	}

	public void setQuienPoseeElProducto(Cliente quienPoseeElProducto) {
		this.quienPoseeElProducto = quienPoseeElProducto;
	}

	
	
}
