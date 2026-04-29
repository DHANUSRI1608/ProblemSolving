import java.util.*;

class ThousandSeparator {
    public String thousandSeparator(int n) {
        String s = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
            count++;
            if (count % 3 == 0 && i > 0) {
                result.append('.');
            }
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            ThousandSeparator obj = new ThousandSeparator();
            String output = obj.thousandSeparator(n);

            System.out.println("Formatted Output: " + output);
        } finally {
            sc.close();
        }
    }
}
