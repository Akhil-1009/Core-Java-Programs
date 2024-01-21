import java.util.Scanner;

public class LinearSearch {
    public static void main(String []args)
    {   System.out.println("enter the size of array");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("enter the elements of array");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the no to be searched");
        int no=sc.nextInt();
        int i;
        for(i=0;i<5;i++)
        {
            if(arr[i]==no)
            {
            System.out.println("no is found at the "+i+"th position");
            break;
            }
        }
        if(i==5)
        {
            System.out.println("no is not found");
        }
        sc.close();     
    
    }

}
