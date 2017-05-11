package testMoovies;

import static org.junit.Assert.*;
// import static org.hamcrest.MatcherAssert.*;

import java.util.ArrayList;

import org.junit.Test;

import moovies.AdministradorDeAmistades;
import moovies.Amistad;
import moovies.Usuario;

public class AdministradorDeAmistadesTestCase {

	@Test
	public void testUnAdministradorDeAmistadesRegistraUnaAmistadEntreDosUsuariosYSeVerificaQueLaAmistadEsteIncluidaEnElAdministrador()
	{
		
		AdministradorDeAmistades unAdministradorDeAmistades = new AdministradorDeAmistades();
		Usuario usuarioSolicitante = new Usuario();
		Usuario usuarioReceptor = new Usuario();
		Amistad unaAmistad = new Amistad();
		
		unaAmistad.establecerAmistadEntre(usuarioSolicitante, usuarioReceptor);
		
		unAdministradorDeAmistades.registrarAmistad(unaAmistad);
		
		assertTrue(unAdministradorDeAmistades.tieneRegistradaLaAmistadDe(usuarioSolicitante,usuarioReceptor));
		assertTrue(unAdministradorDeAmistades.tieneRegistradaLaAmistadDe(usuarioReceptor,usuarioSolicitante));
		
	}
	
	@Test
	public void testUnAdministradorDeAmistadesRegistraUnaAmistadEntreDosUsuariosLuegoLaEliminaYSeVerificaQueLaAmistadEstuvoIncluidaEnElAdministradorPeroQueAhoraYaNoLoEsta()
	{
		
		AdministradorDeAmistades unAdministradorDeAmistades = new AdministradorDeAmistades();
		Usuario usuarioSolicitante = new Usuario();
		Usuario usuarioReceptor = new Usuario();
		
		Amistad unaAmistad = new Amistad();
		
		unaAmistad.establecerAmistadEntre(usuarioSolicitante, usuarioReceptor);
		
		unAdministradorDeAmistades.registrarAmistad(unaAmistad);
		
		assertTrue(unAdministradorDeAmistades.tieneRegistradaLaAmistadDe(usuarioSolicitante,usuarioReceptor));
		
		unAdministradorDeAmistades.eliminarAmistadEntre(usuarioSolicitante,usuarioReceptor);
		
		assertFalse(unAdministradorDeAmistades.tieneRegistradaLaAmistadDe(usuarioSolicitante, usuarioReceptor));
		
	}
	
	@Test
	public void testUnAdministradorDeAmistadesSabeDarLosAmigosDeUnUsuario()
	{
		
		AdministradorDeAmistades unAdministradorDeAmistades = new AdministradorDeAmistades();
		Usuario unUsuario = new Usuario();
		Usuario usuarioAmigoUno = new Usuario();
		Usuario usuarioAmigoDos = new Usuario();
		Usuario usuarioAmigoTres = new Usuario();
		
		Amistad amistadUno = new Amistad();
		
		amistadUno.establecerAmistadEntre(unUsuario,usuarioAmigoUno);
		
		unAdministradorDeAmistades.registrarAmistad(amistadUno);
		
		Amistad amistadDos = new Amistad();
		
		amistadDos.establecerAmistadEntre(usuarioAmigoDos,unUsuario);
		
		unAdministradorDeAmistades.registrarAmistad(amistadDos);
		
		Amistad amistadTres = new Amistad();
		
		amistadTres.establecerAmistadEntre(unUsuario, usuarioAmigoTres);
		
		unAdministradorDeAmistades.registrarAmistad(amistadTres);
		
		ArrayList<Usuario> listaDeAmigos = new ArrayList<Usuario>();
		
		listaDeAmigos.add(usuarioAmigoUno);
		listaDeAmigos.add(usuarioAmigoDos);
		listaDeAmigos.add(usuarioAmigoTres);
	
		assertEquals(unAdministradorDeAmistades.darAmigosDe(unUsuario),listaDeAmigos);
		
	}

}
