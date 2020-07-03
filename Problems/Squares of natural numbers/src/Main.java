import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int nN = 1;
        while (nN * nN <= number) {
            System.out.println(nN * nN);
            nN++;
        }
    }
}