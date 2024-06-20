package Stirngs;

public class Count_The_Number_Of_Words {
    public static void main(String[] args) {
        String str = "This this is is done by Saket Saket";
        String[] words = str.split(" ");

        // Iterate through the words array
        for (int i = 0; i < words.length; i++) {
            // Skip counting if the word is already counted
            if (words[i] == null) {
                continue;
            }

            int count = 1;

            // Count occurrences of the current word
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    // Mark the word as counted to avoid double counting
                    words[j] = null;
                }
            }

            // Print the word and its count
            System.out.println(words[i] + ": " + count);
        }
    }
}
