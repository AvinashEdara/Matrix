package matrix;

import java.util.Scanner;

public class Identity_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("Enter the no.of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the no.of columns");
		int columns = sc.nextInt();
		int a[][] = new int[rows][columns];
		if (rows != columns) {
			System.out.println("rows and columns should be equal");
		} else {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					a[i][j] = sc.nextInt();

				}
			}
			System.out.println("The matrix is ");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(a[i][j] + "\t");
				}
				System.out.println();
			}

			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (i == j && a[i][j] != 1) {
						flag = false;
						break;
					}
					if (i != j && a[i][j] != 0) {
						flag = false;
						break;
					}
				}
			}
			if (flag)
				System.out.println("It's an Identity Matrix");
			else
				System.out.println("It's not an Identity Matrix");
		}
		sc.close();
	}
}
