package test;

//Java code to illustrate clone() method

import java.io.*;
import java.util.*;

public class ArrayListDemo {

	public static void main(String args[]) {// Creating an empty ArrayList
		int arr[] = {2,3,4};
		List<int[]> copyList = Arrays.asList(arr);
		for(int i[] : copyList) System.out.println(i[0] + i[1]);
		System.out.println("Converted array to list " + copyList.size());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		//list.add(1, 5); // will give OOBexception even though default initial capacity is 10

		// Use add() method
		// to add elements in the list
		list.add(16);
		list.add(32);
		list.add(48);

		// Displaying the list
		System.out.println("First ArrayList: " + list);

		// Creating another linked list and copying
		// creates a shallow copy
		@SuppressWarnings("unchecked")
		ArrayList<Integer> sec_list = (ArrayList<Integer>) list.clone();

		sec_list.add(64);

		list.add(22);
		list.remove(2);

		// Displaying the list
		System.out.println("First ArrayList: " + list);

		// Displaying the other linked list
		System.out.println("Second ArrayList is: " + sec_list);

		Collections.sort(list, (a, b) -> Integer.compare(b, a));
		System.out.println("Sorted first ArrayList becomes : " + list);
	}
}
