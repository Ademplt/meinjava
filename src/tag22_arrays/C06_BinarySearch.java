package tag22_arrays;

import java.util.Arrays;

public class C06_BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 6, 78, 9, 0, 5};
        int istenenSayi=1;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 5, 5, 6, 9, 78]
        System.out.println(Arrays.binarySearch(arr,istenenSayi));


    }
}
