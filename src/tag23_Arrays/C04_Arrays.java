package tag23_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen kac elementli bir array istediginizi yazin ");
        int uzunluk=scanner.nextInt();
        int arr[]=new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {
            System.out.println("Array icin " + (i+1)+". elemani giriniz");
            arr[i]=scanner.nextInt();

        }
        System.out.println(Arrays.toString(arr));
    }
}
