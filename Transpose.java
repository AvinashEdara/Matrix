package matrix;

import java.util.Scanner;

public class Transpose {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the no.of columns");
		int columns = sc.nextInt();
		int a[][] = new int[rows][columns];
		int temp[][] = new int[columns][rows];
		if (rows != columns) {
			System.out.println("rows and columns should be equal");
		} else {
			System.out.println("Enter the matrix");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("The input matrix is ");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					System.out.print(a[i][j] + "\t");
				}
				System.out.println();
			}
			for (int i = 0; i < columns; i++) {
				for (int j = 0; j < rows; j++) {
					temp[i][j] = a[j][i];
				}
			}
			System.out.println("Transpose Matrix");
			for (int i = 0; i < columns; i++) {
				for (int j = 0; j < rows; j++) {
					System.out.print(temp[i][j] + "\t");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
