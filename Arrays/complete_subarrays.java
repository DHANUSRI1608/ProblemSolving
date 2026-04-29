import java.util.HashSet;
import java.util.Set;

class CompleteSubarrays {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int distinct = set.size(), res = 0;

        for (int i = 0; i < nums.length; i++) {
            set.clear();
            for (int j = i; j < nums.length; j++) {
                set.add(nums[j]);
                if (set.size() == distinct)
                    res++;
            }
        }
        return res;
    }
}
