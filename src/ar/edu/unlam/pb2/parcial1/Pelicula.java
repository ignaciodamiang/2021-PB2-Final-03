package ar.edu.unlam.pb2.parcial1;

import java.util.HashSet;
import java.util.Set;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;

public class Pelicula extends Producto{

	private Genero genero;
	private Integer anoDeEstreno;
	private String director;
	private Set<String> actores;

	public Pelicula(Integer codigo, String descripcion, Genero genero,
			Integer anoDeEstreno, String director) {
		super(codigo, descripcion);
		this.genero=genero;
		this.anoDeEstreno=anoDeEstreno;
		this.director=director;
		this.actores = new HashSet<String>();	
		}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getAnoDeEstreno() {
		return anoDeEstreno;
	}

	public void setAnoDeEstreno(Integer anoDeEstreno) {
		this.anoDeEstreno = anoDeEstreno;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	public Set<String> getActores() {
		return actores;
	}

	public void setActores(Set<String> actores) {
		this.actores = actores;
	}

	public void agregarActor(String aCTOR_1_ESPERADO) {
		this.actores.add(aCTOR_1_ESPERADO);
	}

	public Boolean actua(String aCTOR_1_ESPERADO) {
		return this.actores.contains(aCTOR_1_ESPERADO);
	}

}
