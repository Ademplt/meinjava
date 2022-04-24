package tag25_Arrayslist;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class C01_Arrayslist {
    public static void main(String[] args) {
        List<String> harfler =new ArrayList<>();
        harfler.add("a");
        harfler.add("b");
        harfler.add("c");
        harfler.add("f");
        harfler.add("k");
        harfler.add("d");
        Collections.sort(harfler);
        System.out.println(harfler);
        List<String>karakterler=new ArrayList<String>();
        karakterler.add("a");
        karakterler.add("b");
        karakterler.add("c");
        System.out.println(harfler.equals(karakterler));
        System.out.println(karakterler.isEmpty());
        karakterler.clear();
        System.out.println(karakterler.isEmpty());


    }
}
