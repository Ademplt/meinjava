package replit2;

public class Q1_perfecktNummer {
    public static void main(String[] args) {
        /*
        Write java code checking the number is Perfect number or not.
        Any number can be a Java Perfect Number if the sum of its positive divisors excluding
        the number itself is equal to that number.
        Input :6 Output:6 is Perfect Number Input :7 Output:7 is not Perfect Number
         */
        int sayi=28;
        int toplam =0;
        for (int i = 0; i <sayi ; i++) {
           try {
               if (sayi%i==0){
                   toplam+=i;
               }
           }catch(Exception e){
               System.out.println("hata kodu : "+e);

           }
        }

        if (toplam == sayi){
            System.out.println(sayi+" is Perfect Number ");
        }else{
            System.out.println(sayi+" is not Perfect Number");
        }
    }
}
