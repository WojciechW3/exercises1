package exercises;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
	}

	public static void question1() {
		System.out.println("Hello world!");
	}

	public static void question2() {
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();	
		System.out.println("Hello " + name);
	}
	
	public static void question3() {
		Scanner s = new Scanner(System.in);
		int value1 = Integer.parseInt(s.nextLine());
		int value2 = Integer.parseInt(s.nextLine());
		int total = value1 + value2;
		System.out.println("The total is " + total);
	}

	public static void question4() {
		Scanner s = new Scanner(System.in);
		int total = 0;
		while (true) {
			int value = Integer.parseInt(s.nextLine());
			if (value == 0) break;
			total = total + value;
		}
		System.out.println("The total is " + total);
	}

	public static void question5() {
		Scanner s = new Scanner(System.in);
		float total = 0;
		while (true) {
			float value = Float.parseFloat(s.nextLine());
			if (value == 0) break;
			total = total + value;
		}
		System.out.println("The total is " + total);
	}

	public static void question6() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of pounds:");
		float value = Float.parseFloat(s.nextLine());
		System.out.println("Choose (1) dollars (2) euros (3) zloty:");
		
		int option = Integer.parseInt(s.nextLine());
		if (option == 1) {
			System.out.println("In dollars:" + (value * 1.30));
		} else if (option == 2) {
			System.out.println("In euros:" + (value * 1.09));
		} else if (option == 3) {
			System.out.println("In zloty:" + (value * 4.86));
		}
	}

	public static void question7() {
		
	}
}
