import java.util.*;
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
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