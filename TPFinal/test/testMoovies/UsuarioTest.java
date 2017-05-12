package testMoovies;

import static org.junit.Assert.*;

import org.junit.Test;

import moovies.Usuario;

public class UsuarioTest {
	Usuario usuario = new Usuario("Juan", "Perez", 20, "Masculino", "Programador", 12);

	@Test
	public void testDadoUnUsuarioSeVerificaQueConozcaSuNombreApellidoEdadSexoOcupacionYCodPostal() {
		assertEquals(usuario.darNombre(), "Juan");
		assertEquals(usuario.darApellido(), "Perez");
		assertEquals(usuario.darEdad(),20);
		assertEquals(usuario.genero(), "Masculino");
		assertEquals(usuario.ocupacion(), "Programador");
		assertEquals(usuario.codPostal(), 12);
	}

}
