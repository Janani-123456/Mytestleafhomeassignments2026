package learnstring.week3.day2;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        // Define two input strings
        String text1 = "stops";
        String text2 = "potss";

        // Check if lengths are equal
        if (text1.length() != text2.length()) {
            System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
            return;
        }

        // Convert strings to character arrays
        char[] arr1 = text1.toCharArray();
        char[] arr2 = text2.toCharArray();

        // Sort both character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Check if sorted arrays are equal
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("The given strings are Anagram.");
        } else {
            System.out.println("The given strings are not an Anagram.");
        }
    }
}