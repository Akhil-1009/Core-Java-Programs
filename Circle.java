 //program to find area and perimeter of circle

import java.util.Scanner;

 
public class Circle {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = in.nextDouble();
        
        System.out.println("Area of circle: "+circleArea(radius));
        System.out.println("Parameter of circle: "+circlePerimeter(radius));
        in.close();     

    }
    public static double circleArea(double r){
        return 3.14*r*r;
    }
    public static double circlePerimeter(double r){
        return 2*3.14*r;
    }
}
