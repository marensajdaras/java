package week4;

import java.util.Arrays.*;
import java.util.Scanner;




public class MainClass {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
		
		int[] arr = new int[25];
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("Enter a value between 1 and 255: ");
			
			int a = scan.nextInt();
			
			arr[i] = a;			
			
		}
		
		
		int sum = 0;
		
		for (int number: arr) {
			
			sum += number;
			
			
		}
		
		int arraylength = arr.length;
		
		double average = ((double) sum / (double) arraylength);
		
		
		
		int gr_value = 0;
		int lu_value = 0;
		
		
		
		
		
		
		
		for (int nr: arr) {
			
			if (nr < 112 & nr%3 == 0) {
				gr_value = nr;
				lu_value = nr;
			}

			
			
			
			
			
		}
		
		
		for (int nr: arr) {
			
			if (nr > gr_value & nr < 112 & nr%3 == 0) {
				gr_value = nr;
			}
			
			if (nr < lu_value & nr < 112 & nr%3 == 0) {
				lu_value = nr;
			}
			
		}
		
		
		
		
		
		
		
		
				
		
		// System.out.println(java.util.Arrays.toString(arr)); 
		 
		System.out.println(java.util.Arrays.toString(arr));
		
		System.out.println("The average: "+average+".");
		
		System.out.println("The largest value below 112 and divisible by 3: "+ gr_value + ".");
		
		System.out.println("The lowest value below 112 and divisible by 3: "+ lu_value + ".");
		
		
		
		
		
		
	}

}


