package testleaf.week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		// starting number 0
		// Ending range 8 --->0, 1, 1, 2, 3, 5, 8, 13
		// Sum of two preceding one

		int a = 0;
		int b = 1;

		for (int i = 0; i < 8; i++) {
			System.out.println(a + " ");
			int c = a + b;
			a = b;
			b = c;

		}
		System.out.println("Reached the Range");
	}

}
