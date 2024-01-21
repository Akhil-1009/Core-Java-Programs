import java.util.Scanner;

public class EvenSum {
    public static void main(String args[]){
    System.out.println("enter the number upto sum");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int i=1;
    int sum=0;
    while(i<=n)
    {
        if(i%2==0)
        {
            sum+=i;
        }
        i++;
    }
    System.out.println("the sum is"+sum);
    sc.close();     

    }
}
