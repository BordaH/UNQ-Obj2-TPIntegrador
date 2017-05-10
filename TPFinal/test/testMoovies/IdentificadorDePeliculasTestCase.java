package testMoovies;

import static org.junit.Assert.*;

import org.junit.Test;

import moovies.IdentificadorDePeliculas;
import moovies.Pelicula;

public class IdentificadorDePeliculasTestCase
{

	@Test
	public void testUnIdentificadorDePeliculasRelacionaUnaPeliculaConSuIDYSeVerificaQueEsteDentroDelIdentificador()
	{
		
		Pelicula unaPelicula = new Pelicula();
		int numeroIDMaximo = 1000;
		IdentificadorDePeliculas unIdentificadorDePeliculas = new IdentificadorDePeliculas(numeroIDMaximo);
		int unID = 10;
		
		unIdentificadorDePeliculas.relacionar(unID, unaPelicula);
		
		assertEquals(unIdentificadorDePeliculas.buscar(unID), unaPelicula);
		
	}

}
