package moovies;


public class Usuario implements Comparable<Usuario>{

	private int id;
	private int edad;
	private String genero;
	private String ocupacion;
	private int codigoPostal;
	private String nombre;
	private String apellido;
	private int cantidadDeCalificaciones;

	public Usuario(int idU, int edadU, String generoU, String ocupacionU, int cp, String nombreU, String apellidoU,
			int cantCalificaciones) {
		this.id = idU;
		this.edad = edadU;
		this.genero = generoU;
		this.ocupacion = ocupacionU;
		this.codigoPostal = cp;
		this.nombre = nombreU;
		this.apellido = apellidoU;
		this.cantidadDeCalificaciones = cantCalificaciones;
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public int getId() {
		return id ;
	}
	
	public int getCantidadDeCalificaciones() {
		return cantidadDeCalificaciones;
	}

	public void contabilizarCalificacion() {
		this.cantidadDeCalificaciones = this.cantidadDeCalificaciones + 1;
	}
	
	@Override
	public int compareTo(Usuario u) {
		return Integer.valueOf(this.getId()).compareTo(u.getId());
	}
}
