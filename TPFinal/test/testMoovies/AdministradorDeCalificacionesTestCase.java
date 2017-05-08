package testMoovies;

import static org.junit.Assert.*;

import org.junit.Test;

import moovies.AdministradorDeCalificaciones;
import moovies.Calificacion;

public class AdministradorDeCalificacionesTestCase
{

	@Test
	public void testUnAdministradorDeCalificacionesRegistraUnaCalificacionYSeVerificaQueLaCalificacionEsteIncluidaEnElAdministrador()
	{
		
		AdministradorDeCalificaciones unAdministradorDeCalificaciones = new AdministradorDeCalificaciones();
		Calificacion unaCalificacion = new Calificacion();
		
		unAdministradorDeCalificaciones.registrarLaCalificacion(unaCalificacion);
		
		assertTrue(unAdministradorDeCalificaciones.tieneRegistradaLaCalificacion(unaCalificacion));
		
	}

}
