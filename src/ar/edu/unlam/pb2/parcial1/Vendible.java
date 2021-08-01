package ar.edu.unlam.pb2.parcial1;

import java.util.Objects;

public abstract class Vendible {
	private Integer codigo;
	private String descripcion;
	private Double precioVenta;
	
	public Vendible(Integer codigo, String descripcion) {
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta=precioVenta;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo, descripcion, precioVenta);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendible other = (Vendible) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(descripcion, other.descripcion)
				&& Objects.equals(precioVenta, other.precioVenta);
	}
	
	
}
