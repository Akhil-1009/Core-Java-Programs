import java.util.Scanner;

public class TwodSum {
    public static void main(String []args){
  int arr[][]=new int[3][3];
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the element of array");
  for(int i=0;i<arr.length;i++)
  {
    for(int j=0;j<arr[0].length;j++)
    {
        arr[i][j]=sc.nextInt();
    }
  }
  int rowsum=Integer.MIN_VALUE;
  int sum=0;
  for(int i=0;i<3;i++)
  {
    for(int j=0;j<3;j++)
    { 
        sum+=arr[i][j];

    }
    rowsum=Math.max(rowsum, sum);
    sum=0;
  }
  sum=0;
  int colsum=Integer.MIN_VALUE;
  for(int i=0;i<3;i++)
  {
    for(int j=0;j<3;j++)
    { 
        sum+=arr[j][i];

    }
    colsum=Math.max(colsum, sum);
    sum=0;
  }
  System.out.println("the max sum is"+Math.max(colsum,rowsum));
  sc.close();     

}
}
