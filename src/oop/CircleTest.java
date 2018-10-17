package oop;

public class CircleTest {

		public static void main(String [] args){

		Circle ball = new Circle();
		System.out.println("ball radius:" + ball.returnRadius());
		System.out.println("ball circumference:" + ball.circumference());
		System.out.println("ball area:" + ball.area());
		ball.changeRadius(7.2);
		System.out.println("ball radius:" + ball.returnRadius());
		ball = new Circle(12.25);
		System.out.println("ball radius:" + ball.returnRadius());
		System.out.println("ball circumference:" + ball.circumference());
		System.out.println("ball area:" + ball.area());
		ball.changeRadius(7.2);
		System.out.println("ball radius:" + ball.returnRadius());
		
		}
}
