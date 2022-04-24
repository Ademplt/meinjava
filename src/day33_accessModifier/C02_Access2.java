package day33_accessModifier;

import static day33_accessModifier.C01_Access.sayi;

public class C02_Access2 {
    public static void main(String[] args) {
       // C01_Access obj=new C01_Access();
        sayi =45;

       // obj.str = "al";
      //  System.out.println(obj.sayi+obj.sayi2);
        C01_Access obj2=new C01_Access(5);
        obj2.str2="adem";
    }

}
