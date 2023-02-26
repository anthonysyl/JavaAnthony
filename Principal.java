public class Principal{
	public static void main(String []args){
	Estudiante estudiante = new Estudiante("Anthony","Carrascal",20,"Ingles","Software");
	estudiante.mostrarDatos();
	MultiplicacionRecursiva multi = new MultiplicacionRecursiva();
	System.out.println("El resultado de una multiplicacion recursiva entre 5 y 4 es: \n"+multi.MR(5, 4));

	}
}