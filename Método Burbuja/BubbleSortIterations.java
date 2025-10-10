public class BubbleSortIterations {
    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo original:");
        printArray(numbers);

        bubbleSort(numbers);
    }

    // Método de Bubble Sort con impresión de iteraciones
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Comparar elementos adyacentes
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Imprimir el estado del arreglo después de cada pasada
            System.out.print("Iteración " + (i + 1) + ": ");
            printArray(arr);

            // Si no hubo intercambios, ya está ordenado
            if (!swapped) break;
        }
    }

    // Método para imprimir el arreglo
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
