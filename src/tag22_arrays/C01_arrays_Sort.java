package tag22_arrays;

import java.util.Arrays;

public class C01_arrays_Sort {
    public static void main(String[] args) {
        String arr[]={"S","M","A","T"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //Java da bu siralamaya Naturel Order denir
        //Sayi olursa kucukten buyuge
        //Metin olursa alfabetik siralamaya koyar

    }
}
