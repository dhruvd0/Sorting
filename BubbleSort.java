import java.util.Scanner;

class BubbleSort {

    public static void sort(int[] arr, int size) {

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        int arr[] = { 5, 4, 3, 2, 1 };
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
        sort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

    }
}