import java.util.*;
class Distinct {
    public int sumCounts(List<Integer> nums) {
        int t = 0;
        int n = nums.size();
        for (int i = 0; i < n; i++) {
            Set<Integer> distinctSet = new HashSet<>();
                for (int j = i; j < n; j++) {
                distinctSet.add(nums.get(j));
                int distinctCount = distinctSet.size();
                t += distinctCount * distinctCount;
            }
        }
        
        return t;
    }
}
