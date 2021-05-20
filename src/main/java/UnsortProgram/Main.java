package UnsortProgram;
/**
 * 美团面试存档
 *
 *
 *
 *
 */

import java.util.Scanner;
class xy{
    int x;int y;
    int pvalue;
    public xy(int x, int y,int p)
    {
        this.x =x;
        this.y = y;
        this.pvalue = p;
    }
}
public class Main {


    static long maxvalue = -1;
    static void best(int x,int value, int i, int n, int a, int b)
    {
        if(i != n)
        {
            best(Math.max(x-a,0),value+x,i+1,n,a,b);
            best(x+b,value,i+1,n,a,b);
        }
        if(i ==n)
        {
            maxvalue = Math.max(value,maxvalue);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(); //收益
            int a = sc.nextInt(); //下降
            int b = sc.nextInt(); //上升
            int n = sc.nextInt(); //n总时间
            best(x,0,0,n,a,b);
            System.out.println(maxvalue);
            maxvalue = -1;

        }

    }
}
        /*int m = sc.nextInt();
        char[][] record = new char[n][m];
        int[][] A = new int[n][m];
        ArrayList<Integer> x = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        AMax(A,n,m);
        for (int i = 0; i <n ; i++) {
            String s = sc.next();
            for (int j = 0; j < m; j++) {
                record[i][j] = s.charAt(j);
                if(record[i][j] == '*')
                {
                    x.add(i);
                    y.add(j);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < x.size(); i++) {
            record[x.get(i)][y.get(i)] = '.';

            dfs(record,A,0,0,n,m,0);
            min = Math.min(min,A[n-1][m-1]);
            AMax(A,n,m);
            record[x.get(i)][y.get(i)] = '*';
        }
        System.out.println(min);
    }
}
        /*int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int x = sc.nextInt(); //收益
            int a = sc.nextInt(); //下降
            int b = sc.nextInt(); //上升
            int n = sc.nextInt(); //n总时间

        }




    }

}
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int h = sc.nextInt();
        int[] record = new int[n+1];
        for (int i = 1; i <=n ; i++) {
            record[i] = sc.nextInt();
        }
        int count = 0;
        int index = 0;
        for (int i = 1; i <=n ; i++) {

            if(record[i]<=h)
            {
                if(count == 0)
                {

                    index = i;
                }
                count++;
            }else {
                index = 0;
                count = 0;
            }

            if(count == m)
            {
                System.out.println(index);break;
            }
        }
        if(count != m)
        {
            System.out.println(-1);
        }
    }
}
*/
 /*static void dfs(char[][] record, int[][] A, int x, int y, int xmax, int ymax, int value)
    {
        Queue<xy> xyQueue = new LinkedList<>();
        xyQueue.add(new xy(x,y,0));
        while (!xyQueue.isEmpty())
        {

            xy now = xyQueue.poll();
            A[now.x][now.y] = Math.min(now.pvalue,A[now.x][now.y]);
            if(now.x+1<xmax && record[now.x+1][now.y] == '.'&& A[now.x+1][now.y] == Integer.MAX_VALUE)
                xyQueue.add(new xy(now.x+1,now.y,now.pvalue+1));

            if(now.x-1>=0 && record[now.x-1][now.y] == '.'&& A[now.x-1][now.y] == Integer.MAX_VALUE)
                xyQueue.add(new xy(now.x-1,now.y,now.pvalue+1));

            if(now.y+1<ymax && record[now.x][now.y+1] == '.'&& A[now.x][now.y+1] == Integer.MAX_VALUE)
                xyQueue.add(new xy(now.x,now.y+1,now.pvalue+1));

            if(now.y-1>=0 && record[now.x][now.y-1] == '.'&& A[now.x][now.y-1] == Integer.MAX_VALUE)
                xyQueue.add(new xy(now.x,now.y-1,now.pvalue+1));

        }

    }
    static void AMax(int[][] A, int x, int y)
    {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                A[i][j] = Integer.MAX_VALUE;

            }
        }
    }*/