package tag22_arrays;

import java.util.Arrays;

public class C10_Arrays_BinarySearch {
    public static void main(String[] args) {
        String strarr[]={"a","b","g","u","o"};
        String istenenHarf="b";
        Arrays.sort(strarr);
        System.out.println(Arrays.toString(strarr));
        System.out.println(Arrays.binarySearch(strarr,istenenHarf));
    }


}
