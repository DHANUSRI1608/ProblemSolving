class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] min = new int[n];

        int mint = Integer.MAX_VALUE;
        for(int i = n - 1; i >= 0; i--){
            if(nums[i] < mint) mint = nums[i];
            min[i] = mint;
        }

        int maxt = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > maxt) maxt = nums[i];
            if(maxt - min[i] <= k) return i;
        }
        return -1;
    }
}