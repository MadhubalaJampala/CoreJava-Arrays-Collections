package org.perscholas.arrays;

import java.util.Scanner;

public class Array3D {

	public static void main(String[] args) {
		int num_array[][][] = {
				{
					{10,20,99},
					{30,40,88}
				},
				{
					{50,60,77},
					{80,70,66}
				},
			};
		
		int employee_arr[][][]= new int[10][3][3];
		employee_arr[0][0][0]= 100;
		Scanner scan = new Scanner(System.in);
		
		int Student_arr[][][] = new int[2][2][3];
		int t,r,c=0;
		for(t=0;t<2;t++) {
			for(r=0;r<2;r++) {
				for(c=0;c<3;c++) {
					System.out.println("Enter value for table: "+t+" row: "+r+" column: "+c);
					Student_arr[t][r][c]=scan.nextInt();
				}
			}
		}
		scan.close();
		
		for(int[][] table: Student_arr)
			for(int[] row:table)
				for(int column:row)
					System.out.println(column);
		
		
	}

}
