public class Principal{
	public static void main(String []args){
	Estudiante estudiante = new Estudiante("Anthony","Carrascal",20,"Ingles","Software");
	estudiante.mostrarDatos();
 	int a = 3;
        int b = 4;
        int resultado = MultiplicacionRecursiva.multiplicar(a, b);
        System.out.println(a + " x " + b + " = " + resultado);
        System.out.println("El resultado como suma es: " + MultiplicacionRecursiva.expresarComoSuma(resultado, a, b));
	}
}