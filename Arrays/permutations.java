import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Permutations {
    List<List<Integer>> result = new ArrayList<>();

    public void permute(int[] nums, int index) {
        if (index == nums.length) {
            List<Integer> div = new ArrayList<>();
            for (int num : nums) {
                div.add(num);
            }
            result.add(div);
            return;
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i = index; i < nums.length; i++) {
            if (set.contains(nums[i]))
                continue;

            set.add(nums[i]);

            swap(nums, index, i);
            permute(nums, index + 1);
            swap(nums, index, i);
        }
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        permute(nums, 0);
        return result;
    }
}