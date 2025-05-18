import java.util.*; 

public class Invertir {
    public static void invertirArray(int[] arr, int inicio, int fin){
        if (inicio >= fin){
            return;
        }

        int temp = arr[inicio];
        arr[inicio] = arr[fin];
        arr[fin] = temp;

        invertirArray(arr, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el tamanio del arreglo: ");
        int n = scan.nextInt();

        int[] arr = new int[n];
        System.out.println("Ingrese "+n+" valores: ");
        for(int i = 0; i < n; i++){
            arr[i] = scan.nextInt();
        }

        invertirArray(arr, 0, n-1);

        System.out.println("Arreglo invertido: ");
        for(int num:arr){
            System.out.print(num+" ");
        }

        scan.close();
    }
}