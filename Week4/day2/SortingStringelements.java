package learnpolymorphism.Week4.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingStringelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare a String array
		String[] array = { "HCL", "Wipro", "Aspire Systems", "CTS" };
		// Add the collection to a list
		List<String> List = new ArrayList<String>();

		for (int i = 0; i < array.length; i++) {
			List.add(array[i]);

		}
		// Sort the List
		Collections.sort(List);
		System.out.println("The sorted elements are :" + List);

		for (int i = List.size() - 1; i >= 0; i--) {
			System.out.println("The sorted elements are :" + List.get(i));
		}
	}

}
