import java.util.*;
class pathSum {
    public boolean function(TreeNode root,int targetSum,int sum)
    {
        if(root==null) return false;
        if(root.left==null && root.right==null )
        {
            sum+=root.val;
            if(sum==targetSum) return true;
        }
        sum+=root.val;
        return (function(root.left,targetSum,sum) ||  function(root.right,targetSum,sum));
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return function(root,targetSum,0);
    }
}