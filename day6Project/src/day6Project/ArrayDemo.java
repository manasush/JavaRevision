package day6Project;

import java.util.Iterator;

public class ArrayDemo {

	public static void main(String[] args) {
		// ARRAY SYNTAX
		
//		int age = 20; can only store one data
//
//		Array is a collection of similar type of data
//		
//		data-type = nameOfArray[] = new datatype[sizeOfArray];
//		
			
		
		int age[] = new int[6];
		
		age[0] = 20;
		age[1] = 21;
		age[2] = 22;
		age[3] = 20;
		age[4] = 21;
		age[5] = 22;
		
		
		System.out.println("list of Array age are: \n");
		
		for(int i =0 ; i< age.length; i++) {
			
					
			
			int j = i;
			System.out.println("age["+j+"] = " + age[i]);
			
			
			
			
			
		}
		
		
		
		
		//syntax For Arrays
//		
//		int num[] = new int[5];
//		
//		
//		//second syntax for array
//		
//		int[] num2 = new int [5];
//		
		
		
		
		int num[] = new int [4];
		
		num[0] = 5;
		num[1] = 6;
		num[2] = 7;
		num[3] = 8;
		
		
			
		System.out.println("Print Array data of num[1]:");
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		
		//////////////////////////////
		
		System.out.println("use sum operation on array num");
		
		
		int sum = 0;
		for (int i = 0; i <num.length; i++) {
			 sum = num[i] + sum;
			 
			 
			
		}
		
		System.out.println(sum);
		
		
		
		
	}
	

}
