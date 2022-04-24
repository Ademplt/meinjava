package haftaninOzeti_Calisma;

public class Explit_Narrowing {
    public static void main(String[] args) {

        int sayi1=456;
        double sayi2=45;
        int sayi3=(int) (sayi1/sayi2);
        System.out.println(sayi3);
        byte sayi4=125;
        int sayi6=53;
        byte sayi5=(byte) (sayi4/sayi6);
        System.out.println(sayi5);
    }
}
