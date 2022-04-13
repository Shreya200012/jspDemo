package oop5;

import java.util.Arrays;

public class array3 {	
		public static void main(String[] args) {
			int a[] = {2,3,4,5,6,7};
			System.out.println(Arrays.toString(a));
			printReverse(a);
			
		}

		private static void printReverse(int[] a) {
			// TODO Auto-generated method stub
			for(int i=a.length-1;i>=0;i--) {
				System.out.println(a[i]);
			}
		}
}
