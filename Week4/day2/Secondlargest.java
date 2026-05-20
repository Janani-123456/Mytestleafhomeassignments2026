package learnpolymorphism.Week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare array
		int[] arr = { 3, 2, 11, 4, 6, 7 };

		// Create List
		List<Integer> List = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {

			List.add(arr[i]);
		}
		// Sort the list in ascending order
		Collections.sort(List);
		System.out.println("Sorted List: " + List);

		// Find second largest number
		int secondLargest = List.get(List.size() - 2);
		// Print second largest number
		System.out.println("Second Largest Number is: " + secondLargest);

	}

}
