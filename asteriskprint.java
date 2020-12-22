package testch5_4;

import java.util.Scanner;

public class asteriskprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter int rows : ");
		n = reader.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j >= n-i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
