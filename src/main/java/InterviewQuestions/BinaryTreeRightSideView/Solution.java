package InterviewQuestions.BinaryTreeRightSideView;

import BasicAlgorithm.StructureOfAlgorithm.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Author: Yuxuan Liu(Nash)
 * Time: 2021/5/5
 * Link of question: https://leetcode-cn.com/problems/binary-tree-right-side-view/
 *
 * Problem-solving ideas:
 *  层序遍历，判断新的层次就累加一
 *
 *  tips，可以用统计法来计算这一层有多少个不需要建立新结构
 *
 */
class levelInfo{
    TreeNode t;
    int level;

    public levelInfo(TreeNode t, int level) {
        this.t = t;
        this.level = level;
    }
}
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
        {
            return new ArrayList<Integer>();
        }
        List<Integer> result = new LinkedList<>();
        Queue<levelInfo> q = new LinkedList<>();
        int nowLevel = 0;
        q.add(new levelInfo(root,1));
        while(!q.isEmpty())
        {
            levelInfo record = q.poll();
            if(record.level != nowLevel)
            {
                result.add(record.t.val);
                nowLevel = record.level;
            }
            if(record.t.right!=null)
                q.add(new levelInfo(record.t.right,record.level+1));
            if(record.t.left!=null)
                q.add(new levelInfo(record.t.left,record.level+1));

        }
        return result;
    }
}