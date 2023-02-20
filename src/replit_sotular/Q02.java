package replit_sotular;

import java.util.Scanner;

public class Q02 {
    /*
    Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

   Input :

   30 and 40

   Expected OutPut:

   GCD for 30 and 40 = 10

   LCM for 30 and 40 = 120
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie zwei Zahlen ein");
        int zahl1=scanner.nextInt();
        int zahl2=scanner.nextInt();
        int gCd=1;
        int lCm;
        int divisor=1;
        int kucukSayi=zahl1<zahl2?zahl1:zahl2; //Math.min(zahl1,zahl2)
        while (divisor<=kucukSayi){
            if (zahl1%divisor==0 && zahl2%divisor==0){
                gCd=divisor;

            }
            divisor++;
        }
        lCm=(zahl1*zahl2)/gCd;
        System.out.println(gCd+" "+lCm);

    }
}
