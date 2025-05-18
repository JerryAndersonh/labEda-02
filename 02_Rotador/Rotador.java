public class Rotador {

    public int[] rotarIzquierdaArray(int[] A, int d) {
        if (d <= 0) {
            return A;
        }
        return rotarIzquierdaArray(rotarUnaVez(A), d - 1);
    }

    private int[] rotarUnaVez(int[] A) {
        int[] nuevo = new int[A.length];
        for (int i = 1; i < A.length; i++) {
            nuevo[i - 1] = A[i];
        }
        nuevo[A.length - 1] = A[0];
        return nuevo;
    }

    // Método para probar
    public static void main(String[] args) {
        Rotador r = new Rotador();
        int[] A = {1, 2, 3, 4, 5};
        int d = 4;
        int[] resultado = r.rotarIzquierdaArray(A, d);

        for (int num : resultado) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
