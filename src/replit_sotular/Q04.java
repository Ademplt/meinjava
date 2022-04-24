package replit_sotular;

public class Q04 {
    public static void main(String[] args) {
    /*
     Write a return method that accepts an integer as input and calculates factorial and prints like output.

     Input : 6

     Output: 6!=65432*1=720
      */
        int sayi=6;
        int faktoriyel=1;
        System.out.print("6! =");
        for (int i = sayi; i >=1 ; i--) {

           faktoriyel*=i;
            System.out.print(i);

        }
        System.out.print( "*1"+"="+ faktoriyel);
    }

}
