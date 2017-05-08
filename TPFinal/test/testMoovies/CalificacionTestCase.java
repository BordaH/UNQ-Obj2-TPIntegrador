package testMoovies;

import static org.junit.Assert.*;

import org.junit.Test;

import moovies.Calificacion;
import moovies.Pelicula;
import moovies.Usuario;

public class CalificacionTestCase
{

	@Test
	public void testDadaUnaCalificacionSeVerificaQueConozcaSuUsuarioSuFechaSuPeliculaYSuValor()
	{
		
		Calificacion unaCalificacion = new Calificacion();
		Usuario unUsuario = new Usuario();
		int unaFecha = 1414014230;
		Pelicula unaPelicula = new Pelicula();
		int unValor = 3;
		
		unaCalificacion.crearCalificacion(unUsuario, unaFecha, unaPelicula, unValor);
		
		assertTrue(unaCalificacion.estaHechaPor(unUsuario));
		assertTrue(unaCalificacion.estaHechaEnLaFecha(unaFecha));
		assertTrue(unaCalificacion.estaHechaSobre(unaPelicula));
		assertTrue(unaCalificacion.estaHechaConValor(unValor));
		
	}

}
