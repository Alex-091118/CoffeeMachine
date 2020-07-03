import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] arrayRes = new int[size];
        arrayRes[0] = arr[size - 1];
        System.arraycopy(arr, 0, arrayRes, 1, size - 1);
        for (int x : arrayRes) {
            System.out.print(x + " ");
        }
    }
}