package tag05_MatematikselIslemler;

public class K06_WrapperClass {

    public static void main(String[] args) {
        String str1="12345";
        String str2="233455";

        System.out.println(str1+str2); // toplamaz yanyana yazdirir

        System.out.println(Integer.valueOf(str1) +  Integer.valueOf(str2));
        int sayi3=Integer.valueOf(str1);
        System.out.println(sayi3);




    }
}
