import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		//Creating Scanner object
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		double radius=input.nextDouble();
		
		//Create circle object
		Circle circle=new Circle(radius);
		circle.displayDetails();
		
		//Closing Scanner class
		input.close();
	}
}
//Creating class Circle
class Circle{
	//Creating Field(Attributes)
	double radius;
	
	//Parameterized Constructor
	Circle(double radius){
		this.radius=radius;
	}
	//Method to calculate area of circle 
	void areaOfCircle(){
		System.out.println(3.14 * radius * radius);
	}
	//Method to calculate circumference of Circle
	void circumferenceOfCircle(){
		System.out.println(2 * 3.14 * radius);
	}
	//Method to display area and circumference of Circle
	void displayDetails(){
		System.out.print("Area of circle : ");
		areaOfCircle();
		System.out.print("Circumference Of Circle : ");
		circumferenceOfCircle();
	}
}