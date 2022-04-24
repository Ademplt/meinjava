package tag22_arrays;

import java.util.Arrays;

public class C05_BinarySearch {
    public static void main(String[] args) {
        // verilen arrayda istenen bir elementin true false yazdirarak bir metod

        int arr[] = {1, 2, 5, 6, 78, 9, 0, 5};
        int istenenSayi=14;

        istenenElemanVarMi(arr,istenenSayi);


    }

    private static void istenenElemanVarMi(int[] arr, int istenenSayi) {
        boolean sonuc=false;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==istenenSayi){
                sonuc = true;

                break;
            }
        }
        System.out.println(sonuc);
    }
}
