public class Persona{
	private String nombre;
	private String apellido;
	private int edad;
	private String idioma;
	public Persona(String nombre, String apellido, int edad,String idioma){
	this.nombre=nombre;
	this.apellido=apellido;
	this.edad=edad;
	this.idioma=idioma;
	}
	public String getNombre(){
		return nombre;
	}
	public String getApellido()
	{
		return apellido;
	}
	public int getEdad(){
		return edad;
	}
	public String getIdioma(){
		return idioma;
	}

}

	
