package tag12_stringManipulation;

public class K02_equals {
    public static void main(String[] args) {
      String str1="Das Leben";
      String str2="Das " + "Leben";

        System.out.println("str1 :" +str1);
        System.out.println("str2 :" +str2);
        System.out.println(str2==str1);
        System.out.println(str1.equals(str2));

        String str3="annem";
        String str4="ANNEM";
        System.out.println(str3.toUpperCase().equals(str4));



    }
}
