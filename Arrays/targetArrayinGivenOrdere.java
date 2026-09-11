import java.util.*;
class targetArrayinGivenOrdere {
    public static void swap(int[] ans,int start,int size)
    {
        for(int i=size-1;i>start;i--)
        {
            ans[i] = ans[i-1];
        }
    }
    public int[] createTargetArray(int[] nums, int[] index) {
        int ans[] = new int[index.length];
        Arrays.fill(ans,Integer.MAX_VALUE);
        for(int i=0;i<index.length;i++)
        {
           if(ans[index[i]]==Integer.MAX_VALUE)
           {
           ans[index[i]]  = nums[i];
           }
           else
           {
            swap(ans,index[i],index.length);
            ans[index[i]] = nums[i];
           }
        }
        return ans;
    }
}