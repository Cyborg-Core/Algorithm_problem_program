package InterviewQuestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class Main{
    static void sort(int[] arr, int begin, int end)
    {
        if(begin>=end)
        {
            return;
        }
        int tmp = arr[begin];
        int i = begin;
        int j = end;
        while (i<j)
        {
            if((i<j) && arr[j] >= tmp)
            {
                j--;
            }
            arr[i] = arr[j];
            if((i<j) && arr[i] <= tmp)
            {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = tmp;
        sort(arr,begin,i-1);
        sort(arr,i+1,end);
    }
    static class Student{
        int no;
        int c;
        int m;
        public Student(int no,int c,int m)
        {
            this.no =no;
            this.c = c;
            this.m = m;
        }
    }
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for(int i = 0;i<3*n;i++)
        {
            int no = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            students[i] = new Student(no,c,m);
        }
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.c+o1.m!=o2.c+o2.m)
                {
                    return o1.c+o1.m - o2.c-o2.m;
                }
                else {
                    return o1.c-o2.c;
                }
            }
        });

        for (Student s: students
             ) {
            System.out.print(s.no+" ");
        }
        /*int p = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sort(a,0,a.length-1);
        int result =0;
        for (int i = 0;p>0;i++)
        {
            p-=a[i];
            result++;

        }
        System.out.print(result);

        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value= 0;
        int pay = 0;
        for(int i= 0;i<n;i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if(x>y)
            {
                value+=x;
                pay+=(x-y);
            }
            else {
                value+=y;
            }
        }
        System.out.println(value+" "+pay);
        /*Scanner sc = new Scanner(System.in);
        int count= 0;
        int num = 0;
        for(int i =1;i<=5;i++)
        {
            int input = sc.nextInt();
            num+=input;
            count += input*i;
        }
        Double a = count/ (double)num;
        if (num == 0)
        {
            System.out.println("0.0");
        }
        else {
            System.out.println(a.toString().substring(0,3));
        }*/


        /**Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[] score  = new int[n];
        for (int i = 0;i<n;i++)
        {
            score[i] = sc.nextInt();
        }
        if(2*y < n)
        {
            System.out.println(-1);
            System.exit(0);
        }
        Arrays.sort(score);
        if(n-y<=y && y<=n-x)
        {
            System.out.println(score[y-1]);
        }

        if(x<=n-x && n-x<=y)
        {
            System.out.println(score[n-x-1]);
        }*/
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score  = new int[n];
        for (int i = 0;i<n;i++)
        {
            score[i] = sc.nextInt();
        }

        Arrays.sort(score);
        int result =0;

        for (int i = 1;i<=n;i++)
        {
            result+= Math.abs(score[i-1]-i);
        }
        System.out.println(result);
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int icase = 0;icase<T;icase++)
        {
            int n = sc.nextInt();
            int[] table = new int[n];
            String a = sc.next();
            for(int i = 0;i<n;i++)
            {
                table[i] = a.charAt(i)-48;
            }
            int m = sc.nextInt();
            String cust = sc.next();
            for(int i = 0;i<m;i++)
            {
                if(cust.charAt(i) == 'M')
                {
                    boolean nosit = true;
                    int zero = -1;
                    for(int j = 0;j<n;j++)
                    {
                        if(table[j] == 1)
                        {
                            table[j] = 2;
                            System.out.println(j+1);
                            nosit = false;
                            break;
                        }
                        if(zero ==-1 && table[j] == 0)
                        {
                            zero = j;
                        }
                    }
                    if(nosit)
                    {
                        table[zero] = 1;
                        System.out.println(zero+1);
                    }
                    for (int k:table
                         ) {
                        System.out.print(k);
                    }
                    System.out.println(cust.charAt(i));
                    System.out.println("");
                }
                else
                {
                    boolean nosit = true;
                    int one = -1;
                    for(int j = 0;j<n;j++)
                    {
                        if(table[j] == 0)
                        {
                            table[j] = 1;
                            System.out.println(j+1);
                            nosit = false;
                            break;
                        }
                        if(one ==-1 && table[j] == 1)
                        {
                            one = j;
                        }
                    }
                    if(nosit)
                    {
                        table[one] = 2;
                        System.out.println(one+1);
                    }
                    for (int k:table
                    ) {
                        System.out.print(k);
                    }
                    System.out.println("");
                }
            }

        }*/
    }
}