package matrix;

import java.util.Scanner;

public class Subtraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int c[][] = new int[3][3];

		System.out.println("Enter the first matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the second matrix");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Substraction....");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] - b[i][j];
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
	}
}
