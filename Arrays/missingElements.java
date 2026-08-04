import java.util.*;
class missingElements {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int end=0,start=Integer.MAX_VALUE;
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            start = Math.min(nums[i],start);
            end = Math.max(nums[i],end);
            set.add(nums[i]);
        }
        for(int i=start;i<=end;i++)
        {
            if(!set.contains(i))
            {
                list.add(i);
            }
        }
        return list;
    }
}