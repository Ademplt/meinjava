package tag12_stringManipulation;

public class K10_replace {
    public static void main(String[] args) {
    String str="Bugun cok yoruldum";
        System.out.println("spaceharic uzunluk :"+str.replace(" ","").length());
        System.out.println("orjinal uzunluk :" +str.length());
        str=str.replace("Bugun","yarin");
        System.out.println(str);
        str=str.replace("yoruldum","yorulacagim");

        System.out.println(str);
    }
}
