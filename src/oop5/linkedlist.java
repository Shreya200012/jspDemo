package oop5;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("USA");
		list.add("AUS");
		list.add("UK");
		list.add("SINGAPORE");
		list.add("MALDIVES");
		list.add("FRANCE");
		list.add("AUSTRIA");
		printList1(list);
		printList(list);

	}

	private static void printList1(List<String> mylist) {
		// TODO Auto-generated method stub
		Iterator<String> it = mylist.iterator();
		while(it.hasNext()) {
		String element = it.next();
		System.out.println("Currently visiting: "+element);

		}
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\");

		
	}
	private static void printList(List<String> mylist) {
		Iterator<String> it = mylist.iterator();
		while (it.hasNext()) {
			String element = it.next();
			if (element.equalsIgnoreCase("AUS")) {
				System.out.println("Removing AUSTRALIA");
				it.remove();
			};
			System.out.println("Now visiting... " + element);			
		}
		System.out.println("--------------------------");
	}

}