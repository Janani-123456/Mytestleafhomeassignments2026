package learnpolymorphism.Week4.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 3, 2, 11, 4, 6, 7 };
		int[] arr2 = { 1, 2, 8, 4, 9, 7 };

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		// Add array elements to list1
		for (int i = 0; i < arr1.length; i++) {
			list1.add(arr1[i]);
		}

		// Add array elements to list2
		for (int i = 0; i < arr2.length; i++) {
			list2.add(arr2[i]);
		}
		// Compare both lists
		System.out.println("Intersection values are:");
		for (int i = 0; i < list1.size(); i++) {

			if (list2.contains(list1.get(i))) {

				System.out.println(list1.get(i));
			}
		}

	}

}
