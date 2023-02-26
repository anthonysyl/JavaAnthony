public class PotenciaDigitosRecursiva {
    
    public static void main(String[] args) {
        int base = 4;
        int exponente = 5;
        
        int resultado = potenciaRecursiva(base, exponente);
        String digitos = digitosRecursiva(resultado, base, exponente);
        
        System.out.println("El resultado de " + base + "^" + exponente + " es: " + resultado);
        System.out.println("Los dígitos que se multiplican para llegar a ese resultado son: " + digitos);
    }

    public static int potenciaRecursiva(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potenciaRecursiva(base, exponente - 1);
        }
    }
    
    public static String digitosRecursiva(int resultado, int base, int exponente) {
        if (exponente == 1) {
            return Integer.toString(base);
        } else {
            int siguienteResultado = resultado / base;
            int siguienteExponente = exponente - 1;
            return digitosRecursiva(siguienteResultado, base, siguienteExponente) + " * " + Integer.toString(base);
        }
    }
}