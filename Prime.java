/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Anshul Pawar
 */
public class Prime {
    public static void main(String [] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Enter a number to check prime or not: ");
        int n = in.nextInt();
        Prime obj = new Prime();
        if(obj.prime(n)){
            System.out.print("Number is NOT Prime!!");
        }
        else{
            System.out.println("Number is prime!! ");
        }   
        in.close();     
    }
    public boolean prime(int n ){
        
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return true;
                
            }
            
        }
        return false;
    }
}









