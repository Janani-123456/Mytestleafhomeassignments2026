package learnstring.week3.day2;

public class StringRemoveDuplicate {

    public static void main(String[] args) {

        String text = "We learn Java basics as part of java sessions in java week1";

        // Split the string into words
        String[] words = text.split(" ");

        // Initialize count
        int count = 0;

        // Compare each word with every other word
        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                // Case-insensitive comparison
                if (words[i].equalsIgnoreCase(words[j])) {

                    // Replace duplicate word with empty string
                    words[j] = "";

                    // Increment count
                    count++;
                }
            }
        }

        // Print modified array if duplicates found
        if (count > 0) {

            for (int i = 0; i < words.length; i++) {

                System.out.print(words[i] + " ");
            }
        }
    }
}
