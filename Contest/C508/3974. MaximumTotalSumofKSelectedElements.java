import java.util.*;
class maximumTotalSumofKSelectedElements {
    public long maxSum(int[] nums, int k, int mul) {
        long sum=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=n-1;i>=n-k;i--)
        {
            if(mul>1)
            {
                sum+=(long)nums[i]*mul;
            }
            else
            {
                sum+=nums[i];
            }
            mul--;
        }
        return sum;
    }
}