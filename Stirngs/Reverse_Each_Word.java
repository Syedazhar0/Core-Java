package Stirngs;

public class Reverse_Each_Word {
    public static void main(String[] args) {
        String str = "Nichebit Softech azhar mazhar athar";
        String[] arr = str.split(" ");
        String after_reverse = "";

        for (int i = 0; i < arr.length; i++) {
            String reverse = ""; // Reset reverse for each word
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                char ch = arr[i].charAt(j); // Access characters in the word
                reverse = reverse + ch; // Concatenate characters in reverse order
            }
            after_reverse = after_reverse + reverse + " "; // Add reversed word to result with a space
        }
        System.out.println(after_reverse.trim()); // Trim to remove extra space at the end
        // using string buffer method
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        System.out.println(buffer);
    }
}
