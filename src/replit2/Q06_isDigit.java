package replit2;

public class Q06_isDigit {
    public static void main(String[] args) {
        /*
        Write a method which accepts a String as parameter and prints the sum
        of the digits, present in the given string.

       input : ade1r4d3

       output : 8

      Hint :
     Use Character.isDigit()
     Integer.valueOf()
         */
        String str="ade1r4d3";
        int toplam =0;
        StringRakamTopla(str,toplam);
        System.out.println(StringRakamTopla(str,toplam));
    }

    private static  int StringRakamTopla(String str,int toplam) {
        str=str.replaceAll("\\D","");

        for(int i=0;i<str.length();i++){
           toplam+=Integer.parseInt(str.substring(i,i+1));
        }

return toplam;
    }
}
