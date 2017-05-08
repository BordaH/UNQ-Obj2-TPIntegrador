package testMoovies;

import static org.junit.Assert.*;

import org.junit.Test;

import moovies.Amistad;
import moovies.Usuario;

public class AmistadTestCase
{

	@Test
	public void testDadaUnaAmistadQueSeCreaEntreDosUsuariosSeVerificaQueAmbosEstenIncluidos()
	{
		
		Amistad amistadEntreDosUsuarios = new Amistad();
		
		Usuario usuarioSolicitante = new Usuario();
		Usuario usuarioReceptor = new Usuario();
		
		amistadEntreDosUsuarios.establecerAmistadEntre(usuarioSolicitante,usuarioReceptor);
		
		assertTrue(amistadEntreDosUsuarios.estaIncluido(usuarioSolicitante));
		assertTrue(amistadEntreDosUsuarios.estaIncluido(usuarioReceptor));
		
	}

}
