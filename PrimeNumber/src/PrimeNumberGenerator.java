import java.util.Scanner;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng số nguyên tố cần hiển thị: ");
        int numbers = scanner.nextInt();

        int count = 0;
        int N = 2;

        System.out.println("Các số nguyên tố đầu tiên là:");
        while (count < numbers) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }

        scanner.close();
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
