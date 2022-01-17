import java.util.Scanner;
public class Average {   
public static void main(String [] args){
    try (Scanner input = new Scanner(System.in)) {
		System.out.print("Enter three numbers: ");
		double firstinput = input.nextDouble();
		double secondinput = input.nextDouble();
		double thirdinput = input.nextDouble();
		double averageoutput = (firstinput+secondinput+thirdinput)/3;
		
		System.out.format("The average of %.1f %.1f %.1f is %.1f",firstinput,secondinput,thirdinput,averageoutput);
		
	}   
  }
}
