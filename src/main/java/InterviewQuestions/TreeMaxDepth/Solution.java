package InterviewQuestions.TreeMaxDepth;

import BasicAlgorithm.StructureOfAlgorithm.TreeNode;

import java.util.*;

/**
 * Author: Yuxuan Liu(Nash)
 * Time: 2021/5/5
 * Link of question: https://www.nowcoder.com/practice/8a2b2bf6c19b4f23a9bdb9b233eefa73
 *
 * Problem-solving ideas:
 *  判断整个树的深度
 *
 */
public class Solution {


    public int maxDepth (TreeNode root) {
        // write code here
        if(root == null)
        {
            return 0;
        }
        int[] record = new int[1];
        dfs(root,record,1);
        return record[0];
    }

    void dfs(TreeNode root, int[] record,int depth)
    {
        record[0] = Math.max(depth,record[0]);
        if(root.left!=null)
            dfs(root.left,record,depth+1);
        if(root.right!=null)
            dfs(root.right,record,depth+1);
    }
}