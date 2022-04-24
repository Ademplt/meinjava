package replit2;

public class Q04_naturelSumme {
    /*

Write a Program to find the sum of natural numbers from 1 to 100.

OUTPUT : Sum of Natural Numbers 5050

*/
    public static void main(String[] args) {
        int sayi=0;
        int toplam=0;
        while (sayi<=100){
            toplam+=sayi;
            sayi++;

        }
        System.out.println("Sum of Natural Numbers " + toplam);
    }
}
