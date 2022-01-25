import java.util.Scanner;
public class Circle {   
public static void main(String [] args){
    	try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a number for radius: ");
			double radiusinput = input.nextDouble();

			double area = radiusinput * radiusinput *3.14159;
			System.out.println("The area for the circle of radius "+radiusinput+" is "+area);
		}
  }
}
