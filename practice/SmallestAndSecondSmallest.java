package practice;
public class SmallestAndSecondSmallest {
    // write a java program to find the smalles and second smallest elements
    public static void main(String[] args) {
        int[] arr = {17, 11, 23, 64, 41, 88, 35, 10};

        // Sorting
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print after sorting
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int smallest = arr[0];
        int secondSmallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest) {
                secondSmallest = arr[i];
                break;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }
}
