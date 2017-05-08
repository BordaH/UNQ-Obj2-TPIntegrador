package testMoovies;

import static org.junit.Assert.*;

import org.junit.Test;

import moovies.AdministradorDeAmistades;
import moovies.Usuario;

public class AdministradorDeAmistadesTestCase {

	@Test
	public void testUnAdministradorDeAmistadesRegistraUnaAmistadEntreDosUsuariosYSeVerificaQueLaAmistadEsteIncluidaEnElAdministrador()
	{
		
		AdministradorDeAmistades unAdministradorDeAmistades = new AdministradorDeAmistades();
		Usuario usuarioSolicitante = new Usuario();
		Usuario usuarioReceptor = new Usuario();
		
		unAdministradorDeAmistades.registrarAmistadEntre(usuarioSolicitante,usuarioReceptor);
		
		assertTrue(unAdministradorDeAmistades.tieneRegistradaLaAmistadDe(usuarioSolicitante,usuarioReceptor));
		
	}
	
	@Test
	public void testUnAdministradorDeAmistadesRegistraUnaAmistadEntreDosUsuariosLuegoLaEliminaYSeVerificaQueLaAmistadEstuvoIncluidaEnElAdministradorPeroQueAhoraYaNoLoEsta()
	{
		
		AdministradorDeAmistades unAdministradorDeAmistades = new AdministradorDeAmistades();
		Usuario usuarioSolicitante = new Usuario();
		Usuario usuarioReceptor = new Usuario();
		
		unAdministradorDeAmistades.registrarAmistadEntre(usuarioSolicitante,usuarioReceptor);
		
		assertTrue(unAdministradorDeAmistades.tieneRegistradaLaAmistadDe(usuarioSolicitante,usuarioReceptor));
		
		unAdministradorDeAmistades.eliminarAmistadEntre(usuarioSolicitante,usuarioReceptor);
		
		assertFalse(unAdministradorDeAmistades.tieneRegistradaLaAmistadDe(usuarioSolicitante, usuarioReceptor));
		
	}

}
