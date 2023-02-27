import java.util.Scanner;
public class Principal{


	public static void main(String []args){
	Estudiante estudiante = new Estudiante("Anthony","Carrascal",20,"Ingles","Software");
	MultiplicacionRecursiva multi = new MultiplicacionRecursiva();
	Scanner scanner= new Scanner(System.in);

	

	System.out.println("Trabajos Anthony");
	System.out.println("1: Estudiante");
	System.out.println("2: Multiplicacion Recursiva");
	System.out.println(" Por favor digite la opcion: ");
	int opcion=scanner.nextInt();
	switch(opcion){
		case 1:
			
			estudiante.mostrarDatos();
			break;
		case 2:
			
			System.out.println("El resultado de una multiplicacion recursiva entre 8 y 4 es: \n"+multi.MR(8, 4));
			break;
		}
				

	}
}