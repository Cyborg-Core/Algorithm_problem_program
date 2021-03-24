package InterviewQuestions;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Solution {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int jinwei = 0;
        ListNode result = null;
        ListNode end = null;
        for(;l1!=null&&l2!=null;)
        {

            int value = jinwei;
            if(l1!=null)
            {
                value +=l1.val;
                l1 = l1.next;
            }
            if(l2!=null)
            {
                value +=l2.val;
                l2 = l2.next;
            }
            if(value>=10)
            {
                jinwei = 1;
                value-=10;
            }
            else {
                jinwei = 0;
            }

            if(result == null){
                end = new ListNode(value);
                result = end;
            }
            else{
                end.next = new ListNode(value);
                end = end.next;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        int a = addTwoNumbers(l1, l2).val;
    }



}
