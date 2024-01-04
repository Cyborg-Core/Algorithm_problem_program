package SolvedProblem.IsSameTree;

import BasicAlgorithm.StructureOfData.TreeNode;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return judgeSame(p,q);
    }

    boolean judgeSame(TreeNode p, TreeNode q)
    {
        boolean a = false;
        boolean b = false;
        boolean c = false;
        if(p.val == q.val)
        {
            a = true;
        }

        if(p.left != null && q.left != null)
        {
            b = judgeSame(p.left,q.left);
        }else if(p.left == null && q.left == null){
            b = true;
        }else {
            return false;
        }

        if(p.right != null && q.right != null)
        {
            c = judgeSame(p.right,q.right);
        }else if(p.right == null && q.right == null){
            c = true;
        }
        else {
            return false;
        }
        return a && b && c;
    }


}
