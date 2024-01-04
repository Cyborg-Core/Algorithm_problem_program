package SolvedProblem.SequencetToPreorder;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public void SequencetToPreorder(List<String> sequentOrder)
    {
        preOrder(sequentOrder,1);
    }

    void preOrder(List<String> sequentOrder, int index)
    {
        System.out.println(sequentOrder.get(index-1));
        if(index*2 <= sequentOrder.size())
        {
            preOrder(sequentOrder,index*2);
        }

        if(index*2+1 <= sequentOrder.size())
        {
            preOrder(sequentOrder,index*2+1);
        }

    }

}
