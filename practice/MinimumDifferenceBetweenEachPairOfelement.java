package practice;

public class MinimumDifferenceBetweenEachPairOfelement {
    public static void main(String[] args) {
        // write a java program to find the minimum difference between each pair of elements
        int[] arr = {-89, -62, -57, 12, 31, 45};
        int mindiff = Integer.MAX_VALUE; // Initialize with maximum possible value
        System.out.println(mindiff);
        // Nested loop to compare each pair of elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = Math.abs(arr[i] - arr[j]);
                if (diff < mindiff) {
                    mindiff = diff;
                }
            }
        }

        System.out.println(mindiff);
    }
}

