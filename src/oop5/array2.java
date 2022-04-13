package oop5;

import java.util.Arrays;
import java.util.Scanner;

public class array2 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] myIntegers = getIntegers(5);
		printMyArray(myIntegers);
		double average = myAverage(myIntegers);
		System.out.println("Average is: "+average);
		int min = findMin(myIntegers);
		System.out.println("Minimum is: "+min);
		int[] newArray = Arrays.copyOf(myIntegers, myIntegers.length);
		//printMyArray(newArray);
		
		
	}
	private static int findMin(int[] myIntegers) {
		// TODO Auto-generated method stub
		int temp=myIntegers[0];
		for(int i=0;i<myIntegers.length;i++) {
			if(myIntegers[i]<temp) {
				int c = myIntegers[i];
				myIntegers[i]=temp;
				temp=c;
			}
		}
		return temp;
	}
	private static double myAverage(int[] myIntegers) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<myIntegers.length;i++) {
			sum=sum+myIntegers[i];
		}
		return sum/myIntegers.length;
	}
	private static void printMyArray(int[] myIntegers) {
		// TODO Auto-generated method stub
		for(int i=0;i<myIntegers.length;i++) {
			System.out.println("Value at position "+(i+1)+" is "+myIntegers[i]);
		}
		
	}
	private static int[] getIntegers(int n) {
		// TODO Auto-generated method stub
		System.out.println("Enter the "+n+" elements for array: ");
		int[] values = new int[n];
		for(int i=0;i<values.length;i++) {
			values[i] = sc.nextInt();
		}
		return values;
	}
}
