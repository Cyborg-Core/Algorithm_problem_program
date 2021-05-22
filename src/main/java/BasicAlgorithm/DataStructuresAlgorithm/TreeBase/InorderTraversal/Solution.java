package BasicAlgorithm.DataStructuresAlgorithm.TreeBase.InorderTraversal;

import BasicAlgorithm.StructureOfAlgorithm.TreeNode;

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

    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor ==-1)
        {
            return Integer.MAX_VALUE;
        }
        if(dividend < divisor || dividend ==0)
        {
            return 0;
        }
        if(dividend < divisor+divisor)
        {
            return 1;
        }
        int a = Math.abs(dividend);
        int b = Math.abs(divisor);
        int time = b;
        for (int i = 2; i < 33; i++) {
            time+=b;
            if(time >= a)
            {
                if(dividend >0 && divisor>0 ||dividend >0 && divisor>0)
                {
                    return i;
                }
                else return -1;
            }
        }

        return 0;
    }
}
