import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class autoimmune_disease{

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        int high = 0;
        int normal = 0;
        for(int i = 0; i < n; i++) {
            int age = sc.nextInt();
            if(age <= 10 || age >= 81)
                high++;
            else
                normal++;
        }
        int days = (high + l - 1) / l + (normal + l - 1) / l;
        System.out.print(days + " Days");
        
    }
}