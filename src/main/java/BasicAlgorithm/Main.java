package BasicAlgorithm;

import javax.swing.text.html.parser.Entity;
import java.lang.reflect.Array;
import java.util.*;
class box {
    int a;
    int b;
    public box(int c,int d)
    {
        a = c;b = d;
    }


}
public class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        Map<Integer,Integer> record = new HashMap<>();
        int count = 0;
        box[] bb = new box[n];
        for (int i = 0; i < n; i++) {
            a[i] =sc.nextInt();
            count+=a[i];
        }
        for (int i = 0; i < n; i++) {
            b[i] =sc.nextInt();
            bb[i] = new box(a[i],b[i]);
        }

        Arrays.sort(bb,new Comparator<box>() {

            @Override
            public int compare(box o1, box o2) {
                return o1.b-o2.b;
            }
        });
        for (box k: bb
             ) {
            System.out.println(k.a+" "+k.b);
        }

        int num = 0;
        for (int i = n-1; i >=0 ; i--) {
            count -= bb[i].b;
            num++;
            if(count <=0)
            {
                break;
            }
        }
        int result = 0;
        for (int i = 0;i<n-num;i++
             ) {
            result += bb[i].a;
        }
        System.out.println(num+" "+result);

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String begin ="";
        String end = "";
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(begin.equals(""))
            {
                begin = sc.next();
                end = sc.next();
                if(begin.equals(end))
                {
                    begin="";
                    count++;
                }
            }else
            {
                sc.next();
                end = sc.next();
                if (end.equals(begin))
                {
                    count++;
                    begin = "";
                }
            }

        }
        System.out.println(count);


        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer>[] linked = new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            linked[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            linked[a].add(b);
            linked[b].add(a);
        }
        /*int count1 = 0;
        for (ArrayList<Integer> a: linked
        ) {
            System.out.println(count1+" "+a);
            count1++;
        }*/
        /*int[] result = new int[n+1];
        result[0] = n+1;
        int classCount =1;
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        for (;count!=n+2;)
        {
            if (!q.isEmpty())
            {
                int node = q.poll();

                result[node] = classCount;
                count++;
                for (int i: linked[node]
                ) {
                    if(result[i]==0)
                    {
                        q.add(i);
                    }
                }
                if(node == 92 || node == 54)
                {
                    System.out.println(q);
                }
            }
            else{
                for (int i = 1;i<=n;i++
                     ) {
                    if(result[i] == 0)
                    {
                        classCount++;
                        q.add(i);
                        break;
                    }
                }

            }

        }
        /*for (int i = 0;i<=n;i++
             ) {
            System.out.println(i+" "+result[i]);
        }*/
        /*System.out.println(classCount);
        for(int i = 1;i<=classCount;i++)
        {
            for(int j = 1;j<result.length;j++)
            {
                if(result[j] == i)
                {
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }*/
    }
}
/*


5 5
1 2
2 2
3 1
4 2
5 5
 */