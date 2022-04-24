package replit2;

import java.util.Scanner;

import static java.lang.Long.reverse;

public class Q03_reverse {
    public static void main(String[] args) {
        /*
        Write a java program to reverse the number which user entered.

      Input :1238
      Output :Reverse Of The Number: 8321
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();
        int reverse=0;

     while (sayi !=0){
       reverse=reverse*10+sayi%10;
       sayi=sayi/10;



     }
        System.out.println("Reverse Of The Number:"+ reverse);
    }
}
