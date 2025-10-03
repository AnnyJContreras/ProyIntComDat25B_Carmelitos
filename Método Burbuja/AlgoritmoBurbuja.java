//Daniela Joselin Falcón Sierra 10-09-2025
import java.util.Scanner;

public class AlgoritmoBurbuja {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir tamaño del arreglo
        System.out.print("Ingrese la cantidad de numeros: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        // Leer los números
        System.out.println("Ingrese los " + n + " numeros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nArreglo original:");
        imprimirArray(numeros);

        // Ordenar con burbuja
        bubbleSort(numeros);

        System.out.println("\nArreglo ordenado:");
        imprimirArray(numeros);
    }

    // Algoritmo burbuja
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean intercambio;

        for (int i = 0; i < n - 1; i++) {
            intercambio = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { //Se verifica si el elemento actual es mayor que el siguiente.
                    // Intercambio
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    intercambio = true;
                }
            }
            if (!intercambio) break; // Si no hubo intercambio, ya está ordenado
        }
    }

    // Método para imprimir el arreglo
    public static void imprimirArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
