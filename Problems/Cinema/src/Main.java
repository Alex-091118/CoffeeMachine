import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int count0 = 0;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        boolean stop = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    count0++;
                    if (count0 == k) {
                        System.out.println(i + 1);
                        stop = true;
                        break;
                    }
                } else {
                    count0 = 0;
                }
            }
            count0 = 0;
            if (stop) {
                break;
            }
        }
        if (!stop) {
            System.out.println(0);
        }
    }
}