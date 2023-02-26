public class MultiplicacionRecursiva {
    public static int MR(int a, int b) {
        if (b == 1) { // Caso base
            return a;
        } else {
            return a + MR(a, b-1); // Llamada recursiva
        }
    }
}