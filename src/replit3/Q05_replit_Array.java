package replit3;

import java.util.Arrays;

public class Q05_replit_Array {
    public static void main(String[] args) {
        /*
        Write a return method that accepts 2 integer Arrays as parameters And adds
        2 array into a new Array and prints it.
        Input1={1,2,3,4}
        Input2={5,6}
        Output={1,2,3,4,5,6}
         */
        int arr1[]={1,2,3,4};
        int arr2[]={5,6};
        int arr3[]=new int[arr1.length+arr2.length];
        arrayBirlestir(arr1,arr2,arr3);

    }

    private static void arrayBirlestir(int[] arr1, int[] arr2,int[] arr3) {
        for (int i = 0; i <arr1.length ;  i++) {
           arr3[i]=arr1[i];

        }
        for (int i = 0; i <arr2.length ;  i++) {
            arr3[arr1.length+i]=arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
