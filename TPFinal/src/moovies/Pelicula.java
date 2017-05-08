package moovies;

import java.util.ArrayList;
import java.util.Date;

public class Pelicula {
	private Integer calificacion;
	private String titulo;
	private Integer id;
	private Date lanzamiento;
	private String url;
	private ArrayList<String> genero;
	
	
	public Pelicula(Integer unaCalificacion, String unTitulo, Integer unID, Date unLanzamiento, String unUrl, ArrayList<String> genero){
		this.calificacion = unaCalificacion;
		this.titulo = unTitulo;
		this.id = unID;
		this.lanzamiento = unLanzamiento;
		this.url = unUrl;
		this.genero = genero;
	}
	
	
	public Pelicula() {
		// TODO Auto-generated constructor stub
	}


	public String getTitulo() {
		return this.titulo;
	}
	
	public Integer getCalificacion(){
		return this.calificacion;
	}
	
	public Date getLanzamiento(){
		return this.lanzamiento;
	}
	
	public String getUrl(){
		return this.url;
	}
	
	public ArrayList<String> getGenero(){
		return this.genero;
	}

	public void setTitulo(String unTitulo){
		this.titulo = unTitulo;
	}
	
	public void setCalificacion(Integer unaCalificacion){
		this.calificacion= unaCalificacion;
	}
	
	public void calcularCalificacion(Integer unaCalificacion){
		this.calificacion = ((this.calificacion + unaCalificacion) / 2);
	}


	public boolean esMiNombre(String unTitulo){
		return this.titulo == unTitulo;
		}


	public boolean esMiID(Integer unID){
		return this.id == unID;
	}


	public Integer getId() {
		return this.id;
	}	
	
}











