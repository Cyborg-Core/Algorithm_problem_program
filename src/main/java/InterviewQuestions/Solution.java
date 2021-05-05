import java.util.*;

/*
 * public class TreeNode {
 *   int val = 0;
 *   TreeNode left = null;
 *   TreeNode right = null;
 * }
 */
/*
public class Solution {
    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    /*ArrayList <Integer> frontList = new ArrayList();
    ArrayList <Integer> midList = new ArrayList();
    ArrayList <Integer> backList = new ArrayList();
    public void front(TreeNode root)
    {

        if(root!=null)
        {

            frontList.add(root.val);
            front(root.left);
            front(root.right);
        }


    }
    public void mid(TreeNode root)
    {
        if(root !=null)
        {
            mid(root.left);
            midList.add(root.val);
            mid(root.right);
        }


    }
    public void back(TreeNode root)
    {
        if(root != null)
        {
            back(root.left);
            back(root.right);
            backList.add(root.val);
            //System.out.println(back.size());

        }


    }
    public int[][] threeOrders (TreeNode root) {
        // write code here

        front(root);
        mid(root);
        back(root);
        int[][] result = new int[3][frontList.size()];
        for(int i = 0;i<frontList.size();i++)
        {
            result[0][i] = frontList.get(i);
            result[1][i] = midList.get(i);
            result[2][i] = backList.get(i);
        }
        return result;

    }
}*/