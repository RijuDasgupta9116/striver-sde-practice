package arrays_Day_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixZeros {

	public static void markRow(int[][] matrix,int row) {
		for(int j=0;j<matrix[0].length;j++) {
			if(matrix[row][j] != 0)
				matrix[row][j] = -1;
		}
	}
	
	public static void markCol(int[][] matrix,int col) {
		for(int i=0;i<matrix.length;i++) {
			if(matrix[i][col] !=0)
				matrix[i][col] = -1;
		}
	}
	public static void setZeros(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j] == 0) {
					markCol(matrix,j);
					markRow(matrix,i);
				}
			}
		}
	}
	
	public static void setZerosBetter(int[][] matrix) {
		int row[] = new int[matrix.length];
		int col[] = new int[matrix[0].length];
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(matrix[i][j] == 0) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		
		
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				if(row[i] == 1 || col[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int matrix[][] = {
							{1,1,1},
							{1,0,1},
							{1,1,1}
						  };
		
//		setZeros(matrix);
//		for(int i=0;i<matrix.length;i++) {
//			for(int j=0;j<matrix[0].length;j++) {
//				if(matrix[i][j] == -1)
//					matrix[i][j] = 0;
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		setZerosBetter(matrix);
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
