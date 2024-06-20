package practice;

public class SeparateEvenAndOddInToNewArrays {
        public static void main(String[] args) {
            // Original array
            int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

            // Counters for even and odd elements
            int evenCount = 0;
            int oddCount = 0;

            // First pass to count even and odd numbers
            for (int number : originalArray) {
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            // Arrays to hold even and odd numbers
            int[] arrayA = new int[evenCount];
            int[] arrayB = new int[oddCount];

            // Indexes for the new arrays
            int indexA = 0;
            int indexB = 0;

            // Second pass to populate the arrays
            for (int number : originalArray) {
                if (number % 2 == 0) {
                    arrayA[indexA++] = number; // Add to arrayA and increment index
                } else {
                    arrayB[indexB++] = number; // Add to arrayB and increment index
                }
            }

            // Output the results
            System.out.print("Array A (Even Elements): ");
            for (int i = 0; i < arrayA.length; i++) {
                System.out.print(arrayA[i] + " ");
            }
            System.out.println();

            System.out.print("Array B (Odd Elements): ");
            for (int i = 0; i < arrayB.length; i++) {
                System.out.print(arrayB[i] + " ");
            }
            System.out.println();
        }
    }


