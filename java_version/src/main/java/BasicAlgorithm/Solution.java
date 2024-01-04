package BasicAlgorithm;

import BasicAlgorithm.StructureOfData.TreeNode;
import java.util.*;

public class Solution {
    /**
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    static ArrayList <Integer> front = new ArrayList();
    static ArrayList <Integer> mid = new ArrayList();
    static ArrayList <Integer> back = new ArrayList();
    public void front(TreeNode root)
    {

        if(root !=null)
        {

            front.add(root.val);
            front(root.left);
            front(root.right);
        }


    }
    public void mid(TreeNode root)
    {
        if(root !=null)
        {
            System.out.println(mid.size());
            mid(root.left);
            mid.add(root.val);
            mid(root.right);
        }


    }
    public void back(TreeNode root)
    {
        if(root != null)
        {
            //System.out.println(back.size());
            back(root.left);
            back(root.right);
            back.add(root.val);
        }


    }
    public int[][] threeOrders (TreeNode root) {
        // write code here
        int[][] result = new int[3][front.size()];
        front(root);
        mid(root);
        back(root);
        for(int i = 0;i<front.size();i++)
        {
            result[0][i] = front.get(i);
            result[1][i] = mid.get(i);
            result[2][i] = back.get(i);
        }
        return result;

    }
}