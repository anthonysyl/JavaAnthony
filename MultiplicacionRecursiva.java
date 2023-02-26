class MultiplicacionRecursiva {
    public static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        } else if (b > 0) {
            return a + multiplicar(a, b - 1);
        } else {
            return -multiplicar(a, -b);
        }
    }

    public static String expresarComoSuma(int resultado, int a, int b) {
        if (resultado == 0) {
            return "0";
        } else if (resultado < 0) {
            return "-" + expresarComoSuma(-resultado, a, b);
        } else if (resultado == a) {
            return Integer.toString(a);
        } else {
            return "(" + expresarComoSuma(resultado - a, a, b) + ") + " + b;
        }
    }
}