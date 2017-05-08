package moovies;

import java.util.ArrayList;

public class AdministradorDeAmistades
{

	private ArrayList<Amistad> amistades = new ArrayList<Amistad>();

	/*
	 * 
	 * Precondicion: Ninguna
	 * Postcondicion: Ninguna
	 * Proposito: Retornar true si dentro del Administrador se encuentra la amistad del usuarioSolicitante y el usuarioReceptor,
	 * caso contrario retornara false
	 * 
	 */
	
	public boolean tieneRegistradaLaAmistadDe(Usuario usuarioSolicitante, Usuario usuarioReceptor)
	{
		
		for(int i = 0; i < amistades.size(); i++)
		{
			
			if( seEncuentraLaAmistadEntre(usuarioSolicitante, usuarioReceptor, i) )
			{
				
				return true;
				
			}
			
		}
		
		return false;
	}

	/*
	 * 
	 * Precondicion: El valor de constante siempre esta incluido dentro del size de amistades
	 * Postcondicion: Ninguna
	 * Proposito: Retornar true si usuarioSolicitante y usuarioReceptor son parte de la amistad buscada
	 * 
	 */
	
	private boolean seEncuentraLaAmistadEntre(Usuario usuarioSolicitante, Usuario usuarioReceptor, int constante)
	{
		
		return amistades.get(constante).estaIncluido(usuarioSolicitante) && amistades.get(constante).estaIncluido(usuarioReceptor);
		
	}

	/*
	 * 
	 * Precondicion: El usuarioSolicitante y el usuarioReceptor deben ser Usuario reales
	 * Postcondicion: Se encuentra registrada una nueva Amistad dentro del Administrador
	 * Proposito: Agregar al Administrador una nueva Amistad conformada por el usuarioSolicitante y el usuarioReceptor
	 * 
	 */
	
	public void registrarAmistadEntre(Usuario usuarioSolicitante, Usuario usuarioReceptor)
	{
		
		Amistad unaAmistad = new Amistad();
		
		unaAmistad.establecerAmistadEntre(usuarioSolicitante, usuarioReceptor);
		
		amistades.add(unaAmistad);
		
	}
	
	/*
	 * 
	 * Precondicion: La amistad entre el usuarioSolicitante y el usuarioReceptor debe estar dentro del Administrador
	 * Postcondicion: La amistad entre el usuarioSolicitante y el usuarioReceptor no se encuentra dentro del Administrador
	 * Proposito: Buscar e eliminar la Amistad entre el usuarioSolicitante y el usuarioReceptor
	 * 
	 */

	public void eliminarAmistadEntre(Usuario usuarioSolicitante, Usuario usuarioReceptor)
	{
		
		for(int i = 0; i < amistades.size(); i++)
		{
			
			if( seEncuentraLaAmistadEntre(usuarioSolicitante, usuarioReceptor, i) )
			{
				
				amistades.remove(i);
				
			}
			
		}

	}


}
