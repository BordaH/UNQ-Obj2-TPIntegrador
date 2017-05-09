package moovies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class AdministradorDeUsuario {
	
	private ArrayList<Usuario> usuarios =new ArrayList<Usuario>();

	public AdministradorDeUsuario() {
		usuarios.add(new Usuario("null", "null", 0,"null","null", 0));
	}

	public void registrarUsuario(String nombreU, String apellidoU, int edadU, String generoU, String ocupacionU, int cpU) {
		usuarios.add(new Usuario( nombreU, apellidoU,edadU, generoU, ocupacionU, cpU));
	}

	public int cantidadDeUsuarios() {
		return usuarios.size();
	}

	public Usuario buscarUsuario(String nombreU){
	Iterator<Usuario> buscado = usuarios.iterator();
	int posicionBuscada = 0;
		while(buscado.hasNext() && posicionBuscada ==0 ){
			Usuario usuarioB = buscado.next();
			int idBuscado = 0 ;
			if (usuarioB.darNombre() != nombreU){
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
