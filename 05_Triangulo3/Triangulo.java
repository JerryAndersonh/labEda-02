public class Triangulo {

    public void trianguloRecursivo(int base) {
        imprimirLinea(1, base);
    }

    private void imprimirLinea(int filaActual, int base) {
        if (filaActual > base) return;

        // Calcular espacios y asteriscos
        int espacios = base - filaActual;
        int asteriscos = 2 * filaActual - 1;

        // Imprimir espacios
        for (int i = 0; i < espacios; i++) {
            System.out.print(" ");
        }

        // Imprimir asteriscos
        for (int i = 0; i < asteriscos; i++) {
            System.out.print("*");
        }

        System.out.println();  // Salto de línea
        imprimirLinea(filaActual + 1, base);  // Llamada recursiva
    }

    public static void main(String[] args) {
        Triangulo t = new Triangulo();
        t.trianguloRecursivo(5);
    }
}