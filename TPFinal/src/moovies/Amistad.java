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

}
