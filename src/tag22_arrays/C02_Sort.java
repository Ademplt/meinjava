package tag22_arrays;

import java.util.Arrays;

public class C02_Sort {
    public static void main(String[] args) {
       //en kucuk sayiyi bulma

        int arr[]={1,2,5,6,78,9,0,5};
        int enKucukSayi=Integer.MAX_VALUE;
        int enBuyukSayi=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] < enKucukSayi){
                enKucukSayi=arr[i];
            }
            if (arr[i] > enBuyukSayi){
                enBuyukSayi=arr[i];
            }

        }
        System.out.println("Arrayda ki en kucuk sayi : " + enKucukSayi);
        System.out.println("Arrayda ki en buyuk sayi : " + enBuyukSayi);

        Arrays.sort(arr);
        System.out.println("Arrayda ki en kucuk sayi : " + arr[0]);
        System.out.println("Arrayda ki en buyuk sayi : " + arr[arr.length-1]);


    }
}
