package SolvedProblem.LongestZigZagPathinaBinaryTree;

import BasicAlgorithm.StructureOfData.TreeNode;

/**
 * 树的问题 几乎都是遍历问题
 *
 *
 *
 */
public class Solution {
    public int longestZigZag(TreeNode root) {
        // statue 为父节点的状态 如果父节点左为1 右为0
        int left = 0;
        int right = 0;
        if(root.left != null)
        {
            left = preorder(root.left,1,1);
        }
        if(root.right != null)
        {
            right = preorder(root.right,1,0);
        }
        return Math.max(left,right);
    }

    int preorder(TreeNode treeNode, int length, int statue)
    {
        int result = length;
        if(treeNode.left != null)
        {
            int left_max = 0;
            if(statue ==1)
            {
                left_max= preorder(treeNode.left,1,1);
            }
            else {
                left_max = preorder(treeNode.left,length+1,1);

            }
            if(left_max > result)
            {
                result = left_max;
            }

        }
        if(treeNode.right != null)
        {
            int right_max = 0;
            if(statue ==0)
            {
                right_max= preorder(treeNode.right,1,0);
            }
            else {
                right_max = preorder(treeNode.right,length+1,0);

            }
            if(right_max > result)
            {
                result = right_max;
            }

        }
        return result;
    }
}
