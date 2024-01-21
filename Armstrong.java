 
import java.util.Scanner;

 
public class Armstrong {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = in.nextInt();
        Armstrong obj = new Armstrong();
        if(obj.checkArmstrong(n)==n){
            System.out.println("Given number is an armstrong number: ");
            
        }
        else{
            System.out.println("Given number is NOT an armstrong number: ");
        }
        in.close();     

    }
    public int checkArmstrong(int n){
        int sum=0;
       
        while (n>0){
            int rem = n%10;
            
            sum = sum+ (rem*rem*rem);
            
            n = n/10;
        }
        return sum;
    }
}
