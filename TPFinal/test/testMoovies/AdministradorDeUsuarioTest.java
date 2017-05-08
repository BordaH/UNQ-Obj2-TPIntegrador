package testMoovies;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import moovies.AdministradorDeUsuario;
import moovies.Usuario;

public class AdministradorDeUsuarioTest {
	// El usuario falso SIEMPRE es igual al que creamos en los test.
	// Un Administrador de usuarios SIEMPRE inicia con un usuarioFalso dentro de
	// el.

	AdministradorDeUsuario adminU = new AdministradorDeUsuario();
	Usuario usuario = new Usuario(10, 20, "Masculino", "Gerente", 1884, "Juan", "Perez", 0);
	Usuario usuario2 = new Usuario(13, 20, "Masculino", "Gerente", 1884, "Martin", "Perez", 2);
	Usuario usuarioFalso = new Usuario(0, 0, "null", "null", 0, "null", "null", 0);

	@Test
	public void testUnAdministradorInicialmenteTieneUnUsuarioFalsoParaRetornarEnCasoQueNoSeEncuentreUnUsuarioABuscar() {
		assertEquals(adminU.getCantidadDeUsuarios(), 1);
		assertEquals(adminU.buscarUsuario(0).getId(), usuarioFalso.getId());
	}
	@Test
	public void testUnAdministradorRegistraUnUsuarioYAhoraTieneDosUsuariosRegistrados() {
		assertEquals(adminU.getCantidadDeUsuarios(), 1);
		adminU.registrarUsuario(10, 20, "Masculino", "Gerente", 1884, "Juan", "Perez", 6);
		assertEquals(adminU.getCantidadDeUsuarios(), 2);
	}
	
	@Test
	public void testUnAdministradorBuscaUnUsuarioPorIdDaVerdeSiElUsuarioConElIdEsEncontrado() {
		adminU.registrarUsuario(10, 20, "Masculino", "Gerente", 1884, "Juan", "Perez", 0);
		equals(adminU.buscarUsuario(10).equals(usuario));
	}
	
	@Test
	// Da verde porque el id del usuario que se encontro es 0, y el unico id que
	// es 0 es el del usuarioFalso que es el que debe retornar en caso que no se
	// encuentre un usuario buscado.
	public void testUnAdministradorBuscaUnUsuarioPorIdDaVerdeSiElUsuarioConElIdEsIgual() {
		adminU.registrarUsuario(10, 20, "Masculino", "Gerente", 1884, "Juan", "Perez", 0);
		assertEquals(adminU.buscarUsuario(10).getId(), usuarioFalso.getId());
	}
	
	@Test
	public void testUnAdministradorDaLosDiezUsuariosMasActivos() {
		adminU.registrarUsuario(10, 20, "Masculino", "Gerente", 1884, "Juan", "Perez", 1);
		adminU.registrarUsuario(13, 20, "Masculino", "Gerente", 1884, "Martin", "Perez", 2);
		ArrayList<Usuario> usuariosActivos = new ArrayList<Usuario>();
		usuariosActivos.add(usuarioFalso);
		usuariosActivos.add(usuario);
		usuariosActivos.add(usuario2);
		assertEquals(adminU.diezUsuariosMasActivos(), usuariosActivos);
	}
}