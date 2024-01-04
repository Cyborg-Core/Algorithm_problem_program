package SolvedProblem.FriendString;

import java.util.Scanner;
/**
 * Author: Yuxuan Liu(Nash)
 * Time: 2021/5/5
 * Link of question: 牛客面试美团
 *
 * Problem-solving ideas:
 *  判断是否构成子序列
 *
 *
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String f = sc.next();
        String name = sc.next();
        long count = 0;
        int num = 0;
        boolean isFriend = true;
        int nowIndex = 0;
        for(int i = 0;i<m;i++)
        {
            for (int j = nowIndex; j < n; j++) {
                nowIndex++;
                if(name.charAt(i) == f.charAt(j))
                {
                    count+=(j+1);
                    num++;
                    break;
                }

            }
        }
        if(num == m)
        {
            System.out.println("Yes");
            System.out.println(count);
        }
        else
        {
            System.out.println("No");
        }
    }

}
