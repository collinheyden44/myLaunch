package oop;

import java.util.Scanner;

public class Room {
	
	public Room() {
		
	}
	
	
	public void area()
	{
		double length = -999;
		double height = -999;
		double area = -999;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the wall? (inches)");
		length = input.nextDouble();
		System.out.println("What is the height of the wall? (inches)");
		height = input.nextDouble();
		area = length * height;
		System.out.println("The area of the wall is " + area + " inches" );
	}
	
	
	
	public void areaWithDoor()
	{
		
	}
	

}

