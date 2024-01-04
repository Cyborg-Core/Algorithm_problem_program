package SolvedProblem;

import java.util.ArrayList;
import java.util.List;

import SolvedProblem.SequencetToPreorder.Solution;
public class Run {

    public static void main(String args[])
    {
        Solution a = new Solution();
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");
        list.add("8");

        a.SequencetToPreorder(list);
    }
}
