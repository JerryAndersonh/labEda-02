public class Triangulo {

    public void trianguloRecursivo2(int base) {
        imprimirLinea(1, base);
    }

    private void imprimirLinea(int actual, int base) {
        if (actual > base) return;

        // Imprimir espacios
        for (int i = 0; i < base - actual; i++) {
            System.out.print(" ");
        }

        // Imprimir asteriscos
        for (int i = 0; i < actual; i++) {
            System.out.print("*");
        }

        System.out.println();
        imprimirLinea(actual + 1, base);
    }

    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.trianguloRecursivo2(5);
    }
}
