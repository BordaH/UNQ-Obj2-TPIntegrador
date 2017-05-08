package moovies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class AdministradorDePeliculas {
	
	private ArrayList<Pelicula> peliculas;
	
	public AdministradorDePeliculas(){
		this.peliculas = new ArrayList<Pelicula>();
	}

	public Pelicula registrarPelicula(int unId, String unNombre, Date lanzamiento, String unUrl, ArrayList<String> genero) {
		 Pelicula nuevaPelicula = new Pelicula (0, unNombre,unId, lanzamiento, unUrl, genero);
		 this.peliculas.add(nuevaPelicula);
		 return nuevaPelicula;
	}

	public ArrayList<Pelicula> getPeliculas() {
		return this.peliculas;
	}

	public Pelicula buscarPelicula(int unId) {
		for (Pelicula pelicula : peliculas) {
			if (unId == pelicula.getId()){
				return pelicula;
			}
			
		}
		return null;
	}
	
	public ArrayList<Pelicula> darDiezMejoresPeliculas(){
		this.peliculas.sort();
		// Sorting
		Collections.sort(fruits, new Comparator<Fruit>() {
		        @Override
		        public int compare(Fruit fruit2, Fruit fruit1)
		        {

		            return  fruit1.fruitName.compareTo(fruit2.fruitName);
		        }
		    }
	}

}
