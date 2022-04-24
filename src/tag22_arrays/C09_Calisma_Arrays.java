package tag22_arrays;

import java.util.Arrays;

public class C09_Calisma_Arrays {
    public static void main(String[] args) {
        String str="java zevkli ama yorucu";
        String harf="a";
        int sayac=0;
        String karakterler[]=str.split("");
        System.out.println(Arrays.toString(karakterler));
        for (int i = 0; i <karakterler.length ; i++) {
            if (karakterler[i].equals(harf)){
                sayac++;
            }

        }
        System.out.println(sayac);
    }
}
