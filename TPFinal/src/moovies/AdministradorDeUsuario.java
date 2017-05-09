package moovies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class AdministradorDeUsuario {
	
	private ArrayList<Usuario> usuarios =new ArrayList<Usuario>();

	public AdministradorDeUsuario() {
		usuarios.add(new Usuario(0, 0 , "null","null",0,"null", "null", 0));
	}

	public void registrarUsuario(int idU, int edadU, String generoU, String ocupacionU, int cpU, String nombreU,
			String apellidoU, int cantCalificaiones) {
		usuarios.add(new Usuario(idU, edadU, generoU, ocupacionU, cpU, nombreU, apellidoU, cantCalificaiones));
	}

	public int getCantidadDeUsuarios() {
		return usuarios.size();
	}

	public Usuario buscarUsuario(int idU){
	Iterator<Usuario> buscado = usuarios.iterator();
	int posicionBuscada = 0;
		while(buscado.hasNext() && posicionBuscada ==0 ){
			Usuario usuarioB = buscado.next();
			int idBuscado = 0 ;
			if (usuarioB.getId() != idU){
				idBuscado = idBuscado + 1 ;
			}else{
				
				posicionBuscada = idBuscado;
			}
		}
		return (this.darUsuario(posicionBuscada));
	}

	private Usuario darUsuario(int posicionBuscada) {
		Usuario usuarioBuscado;
		if(posicionBuscada == 0 ){
			usuarioBuscado = usuarios.get(0);
		}else{
			usuarioBuscado = usuarios.get(posicionBuscada);
		} 
		return usuarioBuscado;
	}
	
	
	public ArrayList<Usuario> diezUsuariosMasActivos()
	{
		
		 Comparator<Usuario> comparador = Collections.reverseOrder();
		
		 usuarios.sort(comparador);
		 
		 return usuarios;
	}
}
