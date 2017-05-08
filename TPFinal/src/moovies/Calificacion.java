package moovies;

public class Calificacion
{

	private Usuario usuario;
	private int fecha;
	private Pelicula pelicula;
	private int valor;

	/*
	 * 
	 * Precondicion: Ninguna
	 * Postcondicion: Ninguna
	 * Proposito: Retornar true si unUsuario es el usuario de la Calificacion
	 * 
	 */
	
	public boolean estaHechaPor(Usuario unUsuario)
	{
		
		return usuario == unUsuario;
		
	}
	
	/*
	 * 
	 * Precondicion: Ninguna
	 * Postcondicion: Ninguna
	 * Proposito: Retornar true si unaFecha es la fecha de la Calificacion
	 * 
	 */
	

	public boolean estaHechaEnLaFecha(int unaFecha)
	{
		
		return fecha == unaFecha;
		
	}
	
	/*
	 * 
	 * Precondicion: Ninguna
	 * Postcondicion: Ninguna
	 * Proposito: Retornar true si unaPelicula es la pelicula de la Calificacion
	 * 
	 */
	

	public boolean estaHechaSobre(Pelicula unaPelicula)
	{
		
		return pelicula == unaPelicula;
		
	}
	
	/*
	 * 
	 * Precondicion: Ninguna
	 * Postcondicion: Ninguna
	 * Proposito: Retornar true si unValor es el valor de la Calificacion
	 * 
	 */
	

	public boolean estaHechaConValor(int unValor)
		{
			
			return valor == unValor;
			
		}
	
	/*
	 * 
	 * Precondicion: Ninguna
	 * Postcondicion: Ninguna
	 * Proposito: Inicializar los parametros internos de la Calificacion
	 * 
	 */
	

	public void crearCalificacion(Usuario unUsuario, int unaFecha, Pelicula unaPelicula, int unValor)
	{

		usuario = unUsuario;
		fecha = unaFecha;
		pelicula = unaPelicula;
		valor = unValor;
		
	}

}
