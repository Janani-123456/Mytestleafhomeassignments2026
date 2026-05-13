package learnstring.week3.day2;

public class StringReverse {

    public static void main(String[] args) {

        String test = "I am a software tester";

        // Split the sentence into words
        String[] words = test.split(" ");

        // Traverse through each word
        for (int i = 0; i < words.length; i++) {

            // Check odd position (index 1, 3, 5...)
            if (i % 2 == 1) {

                // Convert word to character array
                char[] ch = words[i].toCharArray();

                // Print in reverse order
                for (int j = ch.length - 1; j >= 0; j--) {

                    System.out.print(ch[j]);
                }

            } else {

                // Print even position words as it is
                System.out.print(words[i]);
            }

            // Add space after each word
            System.out.print(" ");
        }
    }
}
