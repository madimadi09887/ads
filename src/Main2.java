//task 1
public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
        min = arr[i];
        }
        }
        return min;
        }
        int[] myArray = {3, 6, 2, 8, 1};
        int min = findMinimum(myArray);
        System.out.println("Minimum element: " + min);