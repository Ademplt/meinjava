package Tag16_methodCreation;

public class C01_Method {
    public static void main(String[] args) {
        String str1="adem";
        String str2="polat";
        str1=str1.toUpperCase().substring(0,1)+str1.substring(1,str1.length());
        str2=str2.toUpperCase().substring(0,1)+str2.substring(1,str2.length());

        System.out.println(str1+str2);
        isimBirlestirme(str1,str2);





    }

    public static void isimBirlestirme(String str1, String str2) {
        str1=str1.toUpperCase().substring(0,1)+str1.substring(1,str1.length());
        str2=str2.toUpperCase().substring(0,1)+str2.substring(1,str2.length());

        System.out.println(str1+ " " +str2);

    }
    }
