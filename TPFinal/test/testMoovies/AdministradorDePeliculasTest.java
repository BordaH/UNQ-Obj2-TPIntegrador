package testMoovies;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import moovies.AdministradorDePeliculas;
import moovies.Pelicula;

public class AdministradorDePeliculasTest {
	
	AdministradorDePeliculas adminDePeliculas;
	ArrayList<Pelicula> peliculas;
	Pelicula pelicula2;
	ArrayList<String> genero;
	Date lanzamiento;
	
	@Before
	public void setUp(){
		adminDePeliculas = new AdministradorDePeliculas();
		lanzamiento = new Date(1973,10,18); 
		genero = new ArrayList<String>();
		genero.add("comedia");
		
		
	}

	@Test
	public void testDadaUnaPeliculaElAdministradorDePeliculasLaRegistraYVerificamosQueQeudeRegistrada(){
		pelicula2 = adminDePeliculas.registrarPelicula(2,"El Golpe", lanzamiento, "moovies/ElGolpe", genero);
		ArrayList<Pelicula> peliculas = adminDePeliculas.getPeliculas();
		assertTrue(peliculas.contains(pelicula2));
	}
	
	@Test
	public void testDadoUnIdDePeliculaElAdministadorBuscaLaPeliculaConEsaId(){
		pelicula2 = adminDePeliculas.registrarPelicula(2,"El Golpe", lanzamiento, "moovies/ElGolpe", genero);
		assertEquals(adminDePeliculas.buscarPelicula(2), pelicula2);
	}
	

}
