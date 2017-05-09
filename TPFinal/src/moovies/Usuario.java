package moovies;


public class Usuario implements Comparable<Usuario> {
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private String ocupacion;
	private int codigoPostal;
	private AdministradorDeCalificaciones calificador = new AdministradorDeCalificaciones();
	private AdministradorDePeliculas videotecario = new AdministradorDePeliculas();
	private AdministradorDeAmistades amigos = new AdministradorDeAmistades();

	public Usuario( String nombreU, String apellidoU, int edadU, String generoU, String ocupacionU, int cp) {
		this.nombre = nombreU;
		this.apellido = apellidoU;
		this.edad = edadU;
		this.genero = generoU;
		this.ocupacion = ocupacionU;
		this.codigoPostal = cp;
	}
	
	public String darNombre(){
		return nombre ;
		
	}
	public Integer cantidadDeCalificaciones(){
		return calificador.darCantidadDeCalificaciones();
		
	}
	@Override
	public int compareTo(Usuario u) {
		return this.darNombre().compareTo(u.darNombre());
	}
}
