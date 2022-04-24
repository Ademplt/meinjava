package day17_forLoopSoru;

import java.util.Scanner;

public class C01_forLoopSoru {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 1 den 10 a kadar bir tam sayi giriniz :");
        int rakam=scan.nextInt();
        int faktoriyel=rakam*(rakam-1);
        for (int i= rakam; i >=1 ; i--){
            System.out.print(i);



        }
    }
}
