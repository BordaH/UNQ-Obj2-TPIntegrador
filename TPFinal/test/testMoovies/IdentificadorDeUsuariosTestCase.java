package testMoovies;

import static org.junit.Assert.*;

import org.junit.Test;

import moovies.IdentificadorDeUsuarios;
import moovies.Usuario;

public class IdentificadorDeUsuariosTestCase
{

	@Test
	public void testUnIdentificadorDeUsuariosRelacionaUnUsuarioConSuIDYSeVerificaQueEsteDentroDelIdentificador()
	{
		
		Usuario unUsuario = new Usuario();
		int numeroIDMaximo = 1000;
		IdentificadorDeUsuarios unIdentificadorDeUsuarios = new IdentificadorDeUsuarios(numeroIDMaximo);
		int unID = 10;
		
		unIdentificadorDeUsuarios.relacionar(unID, unUsuario);
		
		assertEquals(unIdentificadorDeUsuarios.buscar(unID), unUsuario);
		
	}

}
