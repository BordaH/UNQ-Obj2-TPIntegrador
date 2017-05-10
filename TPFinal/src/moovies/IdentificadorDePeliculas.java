package moovies;

public class IdentificadorDePeliculas
{
	
	private Pelicula[] organizadorDePeliculas = new Pelicula[0];

	public IdentificadorDePeliculas(int numeroIDMaximo)
	{

		organizadorDePeliculas = new Pelicula[numeroIDMaximo];
		
	}

	/*
	 * 
	 * Precondicion: El valor de unID es un index valido para el organizadorPeliculas
	 * Postcondicion: Ninguna
	 * Proposito: Retornar la pelicula ubicada en el index unID
	 * 
	 */

	public Pelicula buscar(int unID)
	{
		
		return organizadorDePeliculas[unID];
		
	}
	
	
	/*
	 * 
	 * Precondicion: unID nunca es mayor a organizadorDePeliculas.lenght
	 * Postcondicion: Queda establecida la relacion entre unID y unaPelicula
	 * Proposito: Agregar al organizadorDePeliculas unaPelicula
	 * 
	 */

	public void relacionar(int unID, Pelicula unaPelicula)
	{
		
		organizadorDePeliculas[unID] = unaPelicula;
		
	}

}
