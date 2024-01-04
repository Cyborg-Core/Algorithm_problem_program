package SolvedProblem.IsSymmetric;

import BasicAlgorithm.StructureOfData.TreeNode;

public class Solution {
    int first;
    int second;
    boolean isSame = true;
    public boolean isSymmetric(TreeNode root) {
        preorder(root,root);
        return isSame;
    }
    void preorder(TreeNode root1,TreeNode root2)
    {
        if(root1 == null || root2 == null||root1.val != root2.val)
        {
            isSame = false;
            return;
        }
        if(root1.left != null ||root2.right!=null)
        {
            preorder(root1.left,root2.right);
        }
        if(root2.left != null ||root1.right!=null)
        {
            preorder(root1.right,root2.left);
        }

    }
}