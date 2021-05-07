import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int [] record  = new int[]{153,370,371,407};
        while (scanner.hasNext())
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int count = 0;
            for (int i: record
                 ) {
                if(a<=i && i<=b)
                {
                    System.out.print(i+" ");
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println("no");
            }
            else
            {
                System.out.println("");
            }

        }



    }
}
