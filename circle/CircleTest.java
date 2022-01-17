import java.util.Scanner;
public class CircleTest {   
public static void main(String [] args){
    try (Scanner input = new Scanner(System.in)) {
		System.out.print("Enter a number for radius: ");
		double radiusinput = input.nextDouble();
		Circle c = new Circle(radiusinput);
		System.out.println("The area for the circle of radius "+c.radius+" is "+c.getArea());
		System.out.println("The perimeter for the circle of radius "+c.radius+" is "+c.getPerimeter());
	}   
  }
}
