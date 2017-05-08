package testMoovies;

import static org.junit.Assert.*;

import org.junit.Test;

import moovies.Usuario;

public class UsuarioTest {
	Usuario usuario = new Usuario(10, 20, "Masculino" , "Gerente", 1884, "Juan", "Perez", 0);
	@Test
	public void unUsuarioRegistradoTieneUnId() {
		assertEquals(usuario.getId(), 10);
	}
	@Test
	public void unUsuarioQueNoRealizoCalificacionesTieneCeroCantidadDeCalificaciones(){
		assertEquals(usuario.getCantidadDeCalificaciones(),0);
	}
	@Test
	public void unUsuarioQueTieneCeroCantidadDeCalificacionesContabilizadasRealizaUnaCalificacionYAhoraTieneUnaCalificacionPorContar(){
		assertEquals(usuario.getCantidadDeCalificaciones(),0);
		usuario.contabilizarCalificacion();
		assertEquals(usuario.getCantidadDeCalificaciones(),1);
	}

}