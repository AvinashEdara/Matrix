package matrix;

import java.util.Scanner;

public class MatrixEqual_OrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		int flag = 0;
		System.out.println("Enter the first matrix");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				a[i][j] = sc.nextInt();

		System.out.println("Enter the second matrix");
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				b[i][j] = sc.nextInt();

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (a[i][j] != b[i][j]) {
					flag = 1;
					break;
				}
			}
		}
		if (flag == 0)
			System.out.println("Both Matrix are equal");
		else
			System.out.println("They are not equal");
		sc.close();
	}

}
