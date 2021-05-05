package InterviewQuestions.CheckCompletenessofaBinaryTree;

import BasicAlgorithm.StructureOfAlgorithm.TreeNode;

/**
 * Author: Yuxuan Liu(Nash)
 * Time: 2021/5/5
 * Link of question: https://leetcode-cn.com/problems/check-completeness-of-a-binary-tree/
 *
 * Problem-solving ideas:
 * 根据完全二叉树的性质 设任意根节点的位置为在数组中的位置为x，那么他左子树的节点映射到数组之后就是x*2，右子树为x*2+1
 * 根据上述性质遍历整个子树，计算最后一个节点的数组映射是否等于节点总数，就可以算出整个树是否为完全二叉树
 *
 */

public class Solution {
    public boolean isCompleteTree(TreeNode root) {
        int[] record = new int[2];
        dps(root,1,record);
        System.out.print(record[0]+" "+record[1]);
        if(record[0] == record[1])
        {
            return true;
        }
        else {
            return false;
        }

    }

    void dps(TreeNode root,int value,int[] record)
    {
        record[0]++;
        if(value > record[1])
        {
            record[1] = value;
        }

        if(root.left!=null)
        {
            dps(root.left,value*2,record);
        }
        if(root.right!=null)
        {
            dps(root.right,value*2,record);
        }

    }

}


