package practice;
public class PrintArrayElemetsumis9 {
    public static void main(String [] args){
        // write a java program to print the index of the elements whose sum ==9
        int[] nums = {3, 2, 4, 3, 5};

        int firstIndex = -1;
        int secondIndex = -1;
        boolean found = false;

        // Loop through each pair of elements
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == 9) {
                    firstIndex = i;
                    secondIndex = j;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (found) {
            System.out.println("Indices of elements whose sum is 9: " + firstIndex + " " + secondIndex);
        } else {
            System.out.println("No such pair found.");
        }
    }
}
