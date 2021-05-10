package InterviewQuestions.ReConstructBinaryTree;

import BasicAlgorithm.StructureOfAlgorithm.TreeNode;

/**
 * Author: Yuxuan Liu(Nash)
 * Time: 2021/5/5
 * Link of question: https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6
 *
 * Problem-solving ideas:
 *  重点在于 中序遍历中 左边界到根节点的数量等于 先序遍历的第一段左子树子数组的个数 然后加一就是右子树的左边界
 *  并且当只剩下一个元素再向下遍历时 pbegin = pend 使得  pbegin+1 >pend  即为空的左子节点 或右子节点
 *
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        return build(pre,in,0,pre.length-1,0,pre.length-1);
    }

    TreeNode build(int [] pre, int [] in,int pbegin,int pend, int ibegin,int iend){
        if (pbegin > pend) return null;
        TreeNode root = new TreeNode(pre[pbegin]);
        for (int i = ibegin; i <=iend ; i++) {
            if(in[i] == pre[pbegin]){
                root.left = build(pre,in,pbegin+1,pbegin-ibegin+i,ibegin, i-1);
                root.right = build(pre,in, pbegin+i-ibegin+1,pend,i+1, iend);
                break;
            }
        }

        return  root;
    }

}
