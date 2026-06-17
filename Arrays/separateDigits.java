import java.util.ArrayList;
import java.util.List;

public class separateDigits{
    public int[] separateDigits(int[] nums) { 
        List<Integer> arr = new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            String s = String.valueOf(nums[i]);
            for (int j=0;j<s.length();j++) {
                arr.add(s.charAt(j)-'0');
            }
        }
        int[] fin = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            fin[i] = arr.get(i);
        }
        return fin;
    }
} 