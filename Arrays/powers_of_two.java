import java.util.Scanner;

class PowersOfTwo {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        try {
            int n = scanner.nextInt();
            if (n > 0 && (n & (n - 1)) == 0) {
                System.out.print("POWER OF TWO");
            } else {
                System.out.print("NOT A POWER OF TWO");
            }
        } finally {
            scanner.close();
        }
    }
}
