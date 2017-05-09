package moovies;


public class Usuario implements Comparable<Usuario> {
	
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private String ocupacion;
	private int codigoPostal;
	private AdministradorDeCalificaciones calificador;

	public Usuario( String nombreU, String apellidoU, int edadU, String generoU, String ocupacionU, int cp,
			AdministradorDeCalificaciones calificador) {
		this.nombre = nombreU;
		this.apellido = apellidoU;
		this.edad = edadU;
		this.genero = generoU;
		this.ocupacion = ocupacionU;
		this.codigoPostal = cp;
		this.calificador = calificador;
	}
	
	public String darNombre(){
		return nombre ;
		
	}
	
	@Override
	public int compareTo(Usuario u) {
		return this.darNombre().compareTo(u.darNombre());
	}
}
