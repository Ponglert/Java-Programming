package testch5_3;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,y;
		char oper;
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter first number : ");
		a = reader.nextFloat();
		System.out.print("Enter second number: ");
		b = reader.nextFloat();
		System.out.print("Enter operation: ");
		oper = reader.next().charAt(0);

		y = 0;
		if(oper == '+'){
			y = a +b;
		}else if(oper == '-') {
			y = a - b;
		}else if(oper == '*') {
			y = a * b;
		}else if(oper == '/') {
			y = a / b;
		}else if(oper == '%') {
			y = a % b;
		}
		System.out.println("y = " + y);
	}

}
