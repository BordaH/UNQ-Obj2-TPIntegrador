package moovies;

import java.util.ArrayList;

public class Amistad
{

	private ArrayList<Usuario> miembros = new ArrayList<Usuario>();

	/*
	 * 
	 * Precondicion: Ninguna
	 * Postcondicion: Ambos usuarios son miembros de la Amistad
	 * Proposito: Incluir a los usuarios en la Amistad
	 * 
	 */
	
	public void establecerAmistadEntre(Usuario usuarioSolicitante, Usuario usuarioReceptor)
	{

		miembros.add(usuarioSolicitante);
		miembros.add(usuarioReceptor);
		
	}

	/*
	 * 
	 * Precondicion: Ninguna
	 * Postcondicion: Ninguna
	 * Proposito: Retornar true si unUsuario esta incluido en la Amistad
	 * 
	 */
	
	public boolean estaIncluido(Usuario unUsuario)
	{
		
		return miembros.contains(unUsuario);
		
	}

	/*
	 * 
	 * Precondicion: unUsuario debe estar dentro de los miembros de la Amistad
	 * Postcondicion: Ninguna
	 * Proposito: Retornar al Usuario que no es unUsuario y esta dentro de la Amistad
	 * 
	 */
	
	public Usuario darAmigoDe(Usuario unUsuario)
	{
		
		if ( miembros.get(0) == unUsuario )
		{
			
			return miembros.get(1);
			
		}
		
		return miembros.get(0);
		
	}

}
