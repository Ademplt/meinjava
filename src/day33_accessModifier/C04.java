package day33_accessModifier;

public class C04 {
private int sayi;
private String str="";

    public int getSayi() {
        return sayi;
    }


    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "C04{" +
                "sayi=" + sayi +
                ", str='" + str + '\'' +
                '}';
    }
}
