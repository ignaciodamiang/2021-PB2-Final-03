package ar.edu.unlam.pb2.parcial1;

import java.util.HashMap;
import java.util.Map;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Estado;

public class Videoclub {

	private String nombre;
	private Map<Integer, Producto> productos;

	public Videoclub(String nombre) {
		this.nombre = nombre;
		this.productos = new HashMap<Integer, Producto>();
		;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void agregarProducto(Producto nuevoProducto) {
		this.productos.put(nuevoProducto.getCodigo(), nuevoProducto);
	}

	public Producto buscarProducto(Producto nuevoProducto) {
		if (this.productos.containsKey(nuevoProducto.getCodigo())) {
			return productos.get(nuevoProducto.getCodigo());
		} else
			return null;
	}

	public Boolean vender(Producto producto, Cliente cliente) {
		if (productos.containsKey(producto.getCodigo())) {
			productos.get(producto.getCodigo()).setQuienPoseeElProducto(cliente);
			productos.get(producto.getCodigo()).setEstadoActual(Estado.VENDIDO);
			return true;
		} else
			return false;
	}

	public Boolean alquilar(Producto producto, Cliente cliente) {
		if (productos.containsKey(producto.getCodigo())
				&& productos.get(producto.getCodigo()).getEstadoActual().equals(Estado.DISPONIBLE)
				&& cliente.getEdad() >= 18) {
			productos.get(producto.getCodigo()).setQuienPoseeElProducto(cliente);
			productos.get(producto.getCodigo()).setEstadoActual(Estado.ALQUILADO);
			return true;
		} else
			return false;
	}

	public Boolean recibirAlquiler(Producto nuevoProducto, Cliente nuevoCliente) {
		if (productos.containsKey(nuevoProducto.getCodigo())
				&& productos.get(nuevoProducto.getCodigo()).getEstadoActual().equals(Estado.ALQUILADO)) {
			productos.get(nuevoProducto.getCodigo()).setQuienPoseeElProducto(null);
			productos.get(nuevoProducto.getCodigo()).setEstadoActual(Estado.DISPONIBLE);
			return true;
		} else
			return false;
	}

}
