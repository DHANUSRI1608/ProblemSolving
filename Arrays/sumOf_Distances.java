import java.util.HashMap;

class Solution {
    public long[] distance(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];

        HashMap<Integer, Long> count = new HashMap<>();
        HashMap<Integer, Long> sum = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int val = nums[i];

            if (count.containsKey(val)) {
                arr[i] += count.get(val) * i - sum.get(val);
            }

            count.put(val, count.getOrDefault(val, 0L) + 1);
            sum.put(val, sum.getOrDefault(val, 0L) + i);
        }

        count.clear();
        sum.clear();

        for (int i = n - 1; i >= 0; i--) {
            int val = nums[i];

            if (count.containsKey(val)) {
                arr[i] += sum.get(val) - count.get(val) * i;
            }

            count.put(val, count.getOrDefault(val, 0L) + 1);
            sum.put(val, sum.getOrDefault(val, 0L) + i);
        }

        return arr;
    }
}