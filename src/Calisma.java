public class Calisma {

    public static void main(String[] args) {

        //CONCATENATION

        String str1="java";
        String str2="Guzel";

        int sayi1=5;
        int sayi2=3;

        System.out.println(str1+sayi1+str2);

        System.out.println(sayi1+str2+sayi2+str2);

        //35Guzel

        System.out.println(" " + sayi2 + sayi1+str2);

        //java22

        System.out.println(str1 + (sayi1-sayi2)+(sayi1-sayi2)); //java22

        System.out.println((sayi1*sayi2) +str1);


        System.out.println(5*2!=15);

        System.out.println(5*2<15);

        boolean sonuc1=(5+2==7)&&(4+3!=5);
        System.out.println((5*2!=15)&&(5>7));

        //Mantik operatorleri

        System.out.println(5+2==8);

        int sayi6=15;

        System.out.println((sayi6>10) && (sayi6<20));
        System.out.println(sayi6<10 &&  sayi6>20);
        // false ama nasil ture yapariz
        System.out.println(sayi6<10 ||  sayi6>20); // ore yaparsak true verir



    }
}
