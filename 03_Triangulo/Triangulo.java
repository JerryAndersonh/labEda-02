public class Triangulo {

    public void trianguloRecursivo1(int base) {
        imprimirLinea(1, base);
    }

    private void imprimirLinea(int actual, int base) {
        if (actual > base) return;

        for (int i = 0; i < actual; i++) {
            System.out.print("*");
        }
        System.out.println();

        imprimirLinea(actual + 1, base);
    }

    // Método para probar
    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.trianguloRecursivo1(5);
    }
}
