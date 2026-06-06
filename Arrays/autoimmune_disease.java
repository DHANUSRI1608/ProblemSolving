import java.util.*;
//A new medicine named "Medio-cine" is out in the market which helps in 
// treating auto-immune diseases in humans. These are very common in 0-10 year old 
// kids or greater than or equal to 81 year old senior citizens. Both these 
// age groups are considered at a very high risk.


//The government wants to distribute the medicine as soon as possible among 
// all age groups. There is only one(1) political center from where 
// this medicine is distributed. In a single day we cannot provide to both 
// high risk and non high risk age groups.Each person requires only one capsule 
// and there can be L capsules distributed in a day. The high risk humans are supposed 
// to be considered first.There are 'N' humans and 'L' capsules per day.
//  Find the minimum number of days required to medicate all the N humans.
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