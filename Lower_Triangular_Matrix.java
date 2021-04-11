package matrix;

import java.util.Scanner;
// https://www.youtube.com/watch?v=WPl_XwBTbdc

// see the screen shot while you write this is in book to understand what is lower triangular matrix
public class Lower_Triangular_Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no.of rows");
		int rows = sc.nextInt();
		System.out.println("Enter the no.of columns");
		int columns = sc.nextInt();
		int a[][] = new int[rows][columns];
		if(rows!=columns) {
			System.out.println("rows and columns should be equal");
		}
		else {
			System.out.println("Enter the matrix");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("The input matrix is ");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++)  {
					System.out.print(a[i][j]+"\t");
		}
				System.out.println();
			}
			System.out.println("Lower Triangular Matrix is.....");
			for(int i=0;i<rows;i++) {
				for(int j=0;j<columns;j++) {
					if(j>i) // for upper triangular matrix just change the if condition to if(j<i)
						System.out.print("0 ");
					else
						System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		sc.close();	
	}
}
