package moovies;

import java.util.ArrayList;

public class AdministradorDeCalificaciones
{

	private ArrayList<Calificacion> calificaciones = new ArrayList<Calificacion>();

	/*
	 * 
	 * Precondicion: unaCalificacion debe ser una Calificacion real
	 * Postcondicion: Se encuentra registrada una nueva Calificacion dentro del Administrador
	 * Proposito: Agregar al Administrador una nueva Calificacion
	 * 
	 */
	
	public void registrarLaCalificacion(Calificacion unaCalificacion)
	{
		
		calificaciones.add(unaCalificacion);
		
	}

	public boolean tieneRegistradaLaCalificacion(Calificacion unaCalificacion)
	{
		
		return calificaciones.contains(unaCalificacion);
		
	}

	
	
}
