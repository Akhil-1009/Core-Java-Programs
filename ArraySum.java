import java.util.Scanner;

public class ArraySum {
    public static void main(String args[])
    {
        int marks[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers");
        for(int i=0;i<5;i++)
        {
            marks[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<5;i++)
        {
            sum+=marks[i];
        }
        System.out.println("the result is"+sum);
        sc.close();     

    }
}
