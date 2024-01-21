 
import java.util.Scanner;
public class Palindrome {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a 5 digit number: ");
        int num = in.nextInt();
        
        while(countNumber(num) != 5){
            System.out.print("You have to Enter exact 5 digit number: ");
            num = in.nextInt();
        }
        if(checkPalindrome(num)){
            System.out.print("Number is Palindrome!");
        }
        else{
            System.out.print("Number is NOT Palindrome!!");
        }
        in.close();     
        
    }
    public static boolean checkPalindrome(int num){
        String str=Integer.toString(num);
        String s="";
        while(num>0){
            int temp = num%10;
            s = s + temp;
            num /=10;
        }
        if(s.equals(str)){
            return true;
        }
        else{
            return false;
        }
    }
    public static int countNumber(int num){
        int count=0;
            while(num>0){
                 
                count++;
                
                num /= 10;
            }
        return count;
    }
}

