package oop5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class arrayList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> str = new ArrayList<String>();
		str.add("Hey");
		str.add("how");
		str.add("are");
		str.add("you");
		System.out.println("String: "+str);//PRINT LIKE ARRAY
		for(String s : str) {
			System.out.print(s);//PRINT USING FOR EACH LOOP
		}
		List<Integer> s = new ArrayList<Integer>();
		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(null);
		s.add(9);
		s.add(10);
		s.add(11);
		//s.remove(3);
		s.add(4, 34);
		s.add(9, 101);
		System.out.println(s.set(2, 44));
		System.out.println("Integer: "+s);
		for(Integer i : s) {
			System.out.println(i);
		}
		
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		int x = 2;
		Integer y = Integer.valueOf(x);//BOXING
		Integer a = 34;//AUTOBOXING
		Integer c = 5;
		int p = c.intValue();//UNBOXING
		
		List<Integer> d = new ArrayList<Integer>	();//Taking input from user
		int size = 5;
		for(int i =0;i<size;i++) {
			d.add(sc.nextInt());
		}
		for(int h :d) {
			System.out.println(h);
		}
		

		
	} 
}
