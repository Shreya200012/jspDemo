package oop5;

public class Array1 {
	public static void main(String[] args) {
		int array[] = new int[10];
		array[4] = 10;
		System.out.println(array[4]);
		
		int a[]= {1,2,3,4,5,6,7,8};
		for(int i = 0;i<a.length;i++) {
			System.out.println("Value at position "+ i+" is "+ a[i]);
		}
	}
}
