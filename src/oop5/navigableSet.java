package oop5;

import java.util.NavigableSet;
import java.util.TreeSet;

public class navigableSet {
	public static void main(String[] args) {
		NavigableSet<Integer> setOfInt = new TreeSet<Integer>();
		setOfInt.add(3);
		setOfInt.add(56);
		setOfInt.add(35);
		setOfInt.add(9);
		setOfInt.add(76);
		System.out.println(setOfInt);
		
		System.out.println("lower value is: "+setOfInt.lower(35));
		System.out.println("higher value is: "+setOfInt.higher(35));
		System.out.println("floor value is: "+setOfInt.floor(35));
		System.out.println("ceiling value is: "+setOfInt.ceiling(35));
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("First value is: "+setOfInt.first());
		System.out.println("Last  value is: "+setOfInt.last());
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("Descending order is: "+setOfInt.descendingSet());
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		NavigableSet<Integer> headSet = setOfInt.headSet(56, true);
		System.out.println("Head Set: "+headSet);
		headSet.add(33);
		System.out.println("Head Set: "+headSet);

		NavigableSet<Integer> headSet1 = setOfInt.headSet(56, false);
		System.out.println("Had Set 1: "+headSet1);
		




		
	}

}
