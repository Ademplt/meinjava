package tag22_arrays;

import java.util.Arrays;

public class C03_BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        // verilen bir arrayi buyukten kucuge siralayip yazdiran bir metod olusturun
        int arr[]={1,2,5,6,78,9,0,5};
        terstenSiralaYazdir(arr);
    }

    public static void terstenSiralaYazdir(int[] arr) {
        Arrays.sort(arr);
        int tersArr[]=new int[arr.length];
        System.out.println(Arrays.toString(arr)); // [0, 1, 2, 5, 5, 6, 9, 78]

        for (int i = 0; i <arr.length ; i++) {
             tersArr[i] =arr[arr.length - 1-i];


        }
        System.out.println(Arrays.toString(tersArr));
    }
}
