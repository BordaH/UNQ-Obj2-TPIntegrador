package moovies;

public class IdentificadorDeUsuarios
{

	private Usuario[] organizadorDeUsuarios = new Usuario[0];

	public IdentificadorDeUsuarios(int numeroIDMaximo)
	{

		organizadorDeUsuarios = new Usuario[numeroIDMaximo];
		
	}

	/*
	 * 
	 * Precondicion: El valor de unID es un index valido para el organizadoUsuarios
	 * Postcondicion: Ninguna
	 * Proposito: Retornar el Usuario ubicado en el index unID
	 * 
	 */
	
	public Usuario buscar(int unID)
	{
		
		return organizadorDeUsuarios[unID];
		
	}
	
	/*
	 * 
	 * Precondicion: Ninguna
	 * Postcondicion: Queda establecida la relacion entre unID y unUsuario
	 * Proposito: Agregar al organizadorDeUsuarios unUsuarios
	 * 
	 */

	public void relacionar(int unID, Usuario unUsuario)
	{
		
		organizadorDeUsuarios[unID] = unUsuario;
		
	}

}
