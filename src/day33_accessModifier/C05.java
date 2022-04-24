package day33_accessModifier;

public class C05 {
    public static void main(String[] args) {
        C04 obj = new C04();
        System.out.println(obj.getSayi());// 0
        obj.getSayi(); //getter ile getirilebilir ama yeni deger verilemez
        obj.setStr("java java java");
        System.out.println(obj.getStr()); //java java java
        System.out.println(obj); //C04{sayi=0, str='java java java'}

    }
}
