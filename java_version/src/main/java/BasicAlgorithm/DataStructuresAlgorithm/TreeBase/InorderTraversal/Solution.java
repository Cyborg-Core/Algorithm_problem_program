package BasicAlgorithm.DataStructuresAlgorithm.TreeBase.InorderTraversal;

import BasicAlgorithm.StructureOfData.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList();
        inorder(list,root);
        return list;
    }
    void inorder(List l, TreeNode t){
        if(t!= null)
        {
            inorder(l,t.left);
            l.add(t.val);
            inorder(l,t.right);
        }
    }

}
