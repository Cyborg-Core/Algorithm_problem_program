/**
 * 面试题 两个可重复的数组里面找公共的最小模
 */

public class TupleModulus {

    public static void main(String[] args)
    {
        int[] a = new int[]{1,1,4,5,1,4};
        int[] b = new int[]{2,7,3,7,2,7};
        solution(6,8, a, b);
    }

    //

    public static void solution(int n, int m, int[] a, int[] b){
        char[] a1 = new char[2*m];
        char[] b1 = new char[m];
        for (int i = 0; i<n; i++){
            a1[a[i]]++;
            a1[a[i]+m]++;
            b1[b[i]]++;
        }
        String a_result = String.valueOf(a1);
        String b_result = String.valueOf(b1);
        System.out.print(m-a_result.indexOf(b_result));
    }
}
