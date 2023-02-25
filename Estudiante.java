public class Estudiante extends Persona{
	private String carrera;
	
	public Estudiante(String nombre, String apellido, int edad,String idioma,String carrera){
	super(nombre,apellido,edad,idioma);
	this.carrera= carrera;
	}

	public void mostrarDatos(){
	System.out.println("\nNombre: "+getNombre()+
			"\nApellido: "+getApellido()+
			"\nEdad: "+getEdad()+
			"\nIdioma: "+getIdioma()+
			"\nCarrera: "+carrera);
			
	}
}
