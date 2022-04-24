package haftaninOzeti_Calisma;

public class MantikOperatorleri {
    public static void main(String[] args) {
        boolean sonuc1= 5<6 && 3!=5 && 3*5==15;
        System.out.println(sonuc1);
        boolean sonuc2=5<6 && 3!=5 && 3*5==15 && 34>35;
        System.out.println(sonuc2);
        boolean sonuc3=5>4 & 7>9 & 6+3==9  & 5+2!=8;
        System.out.println(sonuc3);
    }
}
