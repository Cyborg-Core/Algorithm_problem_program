package SolvedProblem.IsValid;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 == 1)
        {
            return false;
        }
        Stack<Character> queue = new Stack<>();
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            if(c == '[' ||c == '(' ||c == '{'){
                queue.add(c);
            }else {
                if (!queue.isEmpty() && (c =='}' && queue.pop() == '{' ||
                        c ==']' && queue.pop() == '[' ||
                        c ==')' && queue.pop() == '(' ))
                {
                    continue;
                }else {
                    return false;
                }
            }

        }

        if(queue.isEmpty())
        {
            return true;
        }
        else return false;

    }
}