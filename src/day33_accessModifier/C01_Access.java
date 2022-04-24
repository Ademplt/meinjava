package day33_accessModifier;

public class C01_Access {
    public  static int sayi = 5;
    private String str = "java";
    String str2 = "";
    private static int sayi2 = 3;
    protected int sayi3 = 67;

    protected C01_Access() {

    }

    C01_Access(int sayi) {
        System.out.println("parametresi constructor calisir");
    }


}
