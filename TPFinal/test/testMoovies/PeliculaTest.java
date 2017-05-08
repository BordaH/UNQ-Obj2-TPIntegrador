package testMoovies;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import moovies.Pelicula;

public class PeliculaTest {
	Pelicula pelicula1;
	ArrayList<String> genero;
	 
	
	
	@Before
	public void setUp(){
		pelicula1 = new Pelicula (4, "interestelar", 10, new Date(), "moovies/interestelar", genero );
		
	}

	@Test
	public void testDadaUnaPeliculaSeVerificaQueDevuelvaSuTituloCorrectamente() {
		assertEquals(pelicula1.getTitulo(), "interestelar");
	}
	
	@Test
	public void testDadaUnaPeliculaVerificamosQueDevuelvaSuCalificacionCorrectamente(){
		assertTrue(pelicula1.getCalificacion() == 4);
	}
	
	@Test
	public void testDadaUnaPeliculaLaCualSuCalificacionEes4LaCalificamosConUn2LePreguntamosSiSuCalificacionEs3NosContestaTrue(){
		pelicula1.calcularCalificacion(2);
		assertEquals(pelicula1.getCalificacion().intValue(), 3); //Ver el assert con Equals
	}
	
	@Test
	public void testDadaUnaPeliculaLePreguntamosSiEsSuNombreYDevuelveTrue(){
		assertTrue(pelicula1.esMiNombre("interestelar"));
	}
	
	@Test
	public void testDadaUnaPeliculaLePreguntamosSiEsSuIdYRespondeTrue(){
		assertTrue(pelicula1.esMiID(10));
	}

}
