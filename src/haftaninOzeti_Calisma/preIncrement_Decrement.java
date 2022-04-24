package haftaninOzeti_Calisma;

public class preIncrement_Decrement {
    public static void main(String[] args) {

        int sayi1=15;
        int sayi2=24;
        int sayi3=34;

        sayi1=sayi2++;
        System.out.println(sayi1+" "+sayi2+" "+sayi3); //24 25 34

        sayi3=++sayi2;
        System.out.println(sayi1+" "+sayi2+" "+sayi3);

    }
}
