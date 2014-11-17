public class Partido {
	
	private String nombrePartido;
	private String presidenteNombre;
	private String presidenteApellido;
	private int afiliados = 0;
	private String sede;

	public Partido(String nombrePartido, String presidenteNombre, String presidenteApellido, int afiliados, String sede){
		this.nombrePartido = nombrePartido;
		this.presidenteNombre = presidenteNombre;
		this.presidenteApellido = presidenteApellido;
		this.afiliados = afiliados;
		this.sede = sede;
	}

	public String getNombrePartido(){
		return nombrePartido;
	}
	public void setNombrePartido(String nombrePartido){
		this.nombrePartido = nombrePartido;
	}

	public String getPresidenteNombre(){
		return presidenteNombre;
	}
	public void setPresidenteNombre(String presidenteNombre){
		this.presidenteNombre = presidenteNombre;
	}
	public String getPresidenteApellido(){
		return presidenteApellido;
	}
	public void setPresidenteApellido(String presidenteApellido){
		this.presidenteApellido = presidenteApellido;
	}
	public int getAfiliados(){
		return afiliados;
	}
	public void setAfiliados(int afiliados){
		this.afiliados = afiliados;
	}
	public String getSede(){
		return sede;
	}
	public void setSede(String sede){
		this.sede = sede;
	
			
	}
	
	
}				

