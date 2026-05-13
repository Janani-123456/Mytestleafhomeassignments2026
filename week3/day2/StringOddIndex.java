package learnstring.week3.day2;

public class StringOddIndex {
    public static void main(String[] args) {
        String test = "changeme";
        // Convert String to character array
        char[] a = test.toCharArray();

        for (int i = a.length - 1; i >= 0; i--) {
             // Check odd index
            if (i % 2 == 1) {
                // Convert to uppercase
                a[i]=Character.toUpperCase(a[i]);

            }

        }System.out.println(a);
    }
}
