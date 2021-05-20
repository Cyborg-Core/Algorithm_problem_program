package UnsortProgram.meituan_catchTT;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        int[] dp= new int[n];
        if(s.charAt(0) == 'E')
        {
            dp[0] = 1;
        }else {
            dp[0] = 0;
        }
        int max = (-1*n)-1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) =='E')
            {
                dp[i] = dp[i-1]+1;
            }
            else {
                dp[i] = Math.max(-1,dp[i-1]-1);
            }
            max = Math.max(dp[i],max);

        }
        System.out.println(max);
    }
}/*
        int[] record = new int[n+1];
        int[] workList = new int[n+1];
        for (int i = 1; i <= n; i++) {
            boolean ischoose = false;
            for (int j = 1; j <= n; j++) {
                int work = scanner.nextInt();
                if(!ischoose && workList[work] == 0)
                {
                    record[i] = work;
                    workList[work] = 1;
                    ischoose = true;
                }
            }
        }
        for (int i = 1; i <=n ; i++) {
            System.out.print(record[i] +" ");
        }
    }
}
        /*String x = scanner.next();
        int begin = 0;
        boolean find = false;
        for (int i = 0; i < x.length(); i++) {
            if(x.charAt(i) == 'M')
            {
                find = true;
            }else if(x.charAt(i) == 'T' && find)
            {
                begin = i+1;
                break;
            }
        }
        find = false;
        int end = x.length()-1;
        for (int i = x.length()-1; i >=0; i--) {
            if(x.charAt(i) == 'T')
            {
                find = true;
            }else if(x.charAt(i) == 'M' && find)
            {
                end = i;
                break;
            }
        }

        System.out.println(x.substring(begin,end));


    }
}

        /*int y =scanner.nextInt();


        ArrayList<Integer> list []= new ArrayList[n+1];
        for (int i = 0; i <= n; i++) {
            list[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i <4 ; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(a+" "+b);
            list[a].add(b);
            list[b].add(a);
        }
        int[][] record = new int[n+1][2];
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < 2; j++) {
                record[i][j] = -1;
            }
        }
        record[x][0] =0;
        record[y][1] =0;

        Queue<Integer> q = new LinkedList<>();
        q.add(x);
        while (!q.isEmpty())
        {
            int now = q.poll();
            for (int i: list[now]
                 ) {
                if(record[i][0]==-1)
                {
                    q.add(i);
                    record[i][0] = record[now][0]+1;
                }
            }

        }

        q.add(y);
        int max = 0;
        int index=y;
        while (!q.isEmpty())
        {
            int now = q.poll();
            for (int i: (ArrayList<Integer>)list[now]
            ) {
                if(record[i][1]==-1 )
                {
                    q.add(i);
                    record[i][1] = record[now][1]+1;
                    if(record[i][1] > max && record[i][1] < record[i][0])
                    {
                        max = record[i][1];
                        index = i;
                    }
                }
            }

        }
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(record[i][j]);
            }
            System.out.println();
        }
        System.out.println(record[index][0]);

    }
}*/
