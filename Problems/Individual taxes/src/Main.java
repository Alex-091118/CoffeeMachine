import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countCompany = scanner.nextInt();
        int[] companyIncome = new int[countCompany];
        int[] taxesCompany = new int[countCompany];
        for (int i = 0; i < countCompany; i++) {
            companyIncome[i] = scanner.nextInt();
        }
        for (int i = 0; i < countCompany; i++) {
            taxesCompany[i] = scanner.nextInt();
        }
        int[] taxSize = new int[countCompany];
        for (int i = 0; i < countCompany; i++) {
            taxSize[i] = companyIncome[i] * taxesCompany[i];
        }
        int[] taxSizeSort = new int[countCompany];
        System.arraycopy(taxSize, 0, taxSizeSort, 0, countCompany);
        Arrays.sort(taxSizeSort);
        for (int i = 0; i < countCompany; i++) {
            if (taxSize[i] == taxSizeSort[countCompany - 1]) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}