import java.util.*;
class Leetcode {
    public List<Integer> filterRestaurants(int[][] res, int veganFriendly, int maxPrice, int maxDistance) {
        List<int[]> ans=new ArrayList<>();
        int n=res.length;
        for(int i=0;i<n;i++){
            if(veganFriendly==1 && res[i][2]==0){
                continue;
            }
            if(res[i][3]>maxPrice){
                continue;
            }
            if(res[i][4]>maxDistance){
                continue;
            }
            ans.add(new int[]{res[i][0],res[i][1]});
        }
        Collections.sort(ans,(a,b)->{
            if(b[1]==a[1]){
                return b[0]-a[0];
            }
            return b[1]-a[1];
        });
        List<Integer> val=new ArrayList<>();
        for(int[] a:ans){
            val.add(a[0]);
        }
        return val;
    }
}