package tenprojects;

import java.util.Scanner;

/////    SCANNER   //////


    public class PartOne {
	int speed;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PartOne myCar = new PartOne();  // Create a myCar object
		myCar.fullThrottle();   // Call the fullThrottle() method
		myCar.Speed(200);  // Call the speed() method
	}
		
		// Create a fullThrottle() method
		public void fullThrottle()  {
			System.out.println("Whats the car's Speed? ");
			Scanner sc = new Scanner(System.in);
			speed = sc.nextInt();
		}
	// Create a speed() method and add a parameter 
	public void Speed(int maxspeed){
		maxspeed = speed;
		System.out.println("The Max Speed is: " + maxspeed);
	}

	// Inside main, call the methods on the myCar object 


	// The car is going as fast as it can!
	// Max speed is: 200

} 
