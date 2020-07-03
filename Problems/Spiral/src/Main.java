import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        int num = 1;
        int top = 0;
        int right = n - 1;
        int bottom = n - 1;
        int left = 0;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                array[top][i] = num;
                num++;
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                array[i][right] = num;
                num++;
            }
            right--;
            for (int i = right; i >= left; i--) {
                array[bottom][i] = num;
                num++;
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                array[i][left] = num;
                num++;
            }
            left++;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
