package learnpolymorphism.Week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {

		// Declare array
		int[] arr = {1, 2, 3, 4, 10, 6, 8};

		// Create List
		List<Integer> list = new ArrayList<Integer>();

		// Add array elements to list
		for (int i = 0; i < arr.length; i++) {

			list.add(arr[i]);
		}

		// Sort the list
		Collections.sort(list);

		// Print sorted list
		System.out.println("Sorted List: " + list);

		// Find missing elements
		System.out.println("Missing Elements are:");

		for (int i = 0; i < list.size() - 1; i++) {

			// Current element
			int current = list.get(i);

			// Next element
			int next = list.get(i + 1);

			// Check for gap
			if (current + 1 != next) {

				// Print missing numbers
				for (int j = current + 1; j < next; j++) {

					System.out.println(j);
				}
			}
		}
	}
}