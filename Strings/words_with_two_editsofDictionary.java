import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isTrue(String word1,String word2)
    {
        int count=0;
        for(int i=0;i<word1.length();i++)
        {
            if(word1.charAt(i)!=word2.charAt(i))
            {
                count++;
            }
            if(count>2)
            {
                return false;
            }
        }
        return true;
    }
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<queries.length;i++)
        {
         for(int j=0;j<dictionary.length;j++)
         {
            if(queries[i].equals(dictionary[j]) && i!=j)
            {
                ans.add(queries[i]);
                break;
            }
            if(isTrue(queries[i],dictionary[j]))
            {
                ans.add(queries[i]);
                break;
            }
         }
        }
        return ans;
    }
}