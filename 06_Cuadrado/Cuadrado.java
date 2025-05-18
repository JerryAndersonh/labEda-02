public class Cuadrado {

    public void cuadradoRecursivo(int base) {
        imprimirLinea(1, base);
    }

    private void imprimirLinea(int fila, int base) {
        if (fila > base) {
            return;
        }

        if (fila == 1 || fila == base) {
            // Primera o última línea: todos asteriscos
            for (int i = 0; i < base; i++) {
                System.out.print("*");
            }
        } else {
            // Líneas intermedias: asterisco, espacios, asterisco
            System.out.print("*");
            for (int i = 0; i < base - 2; i++) {
                System.out.print(" ");
            }
            System.out.print("*");
        }

        System.out.println();
        imprimirLinea(fila + 1, base);
    }

    public static void main(String[] args) {
        Cuadrado c = new Cuadrado();
        c.cuadradoRecursivo(5);
    }
}
