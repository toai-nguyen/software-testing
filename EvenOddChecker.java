import java.util.Scanner;

public class EvenOddChecker {
    
    // Phương thức chính
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập một số nguyên dương: ");
        int number = scanner.nextInt();

        printEvenOdd(number);
        
        scanner.close();
    }

    // Phương thức có chứa vòng lặp và lệnh rẽ nhánh
    public static void printEvenOdd(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " là số chẵn.");
            } else {
                System.out.println(i + " là số lẻ.");
            }
        }
    }
}
