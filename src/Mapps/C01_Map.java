package Mapps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C01_Map {
    public static void main(String[] args) {
         /*
    Soru 2 ) Verilen map’te istenen programlama dilini bilen kisileri
    list olarak donduren bir method yaziniz.
    map {    101=Ali, Can, java, 102=Veli, Yan, java, 103=Ali, Yan, C#}
    Istenen dil  java
    Sonuc  [Ali, Veli]
     */
        Map<Integer, String> sinifList = new HashMap<>();
        sinifList.put(101, "Ali, Can, Dev, 1453");
        sinifList.put(102, "Veli, Yan, QA, 1990");
        sinifList.put(103, "Ali, Yan, C#, 2000");
        sinifList.put(104, "Ayse, kan, C#, 2001");
        sinifList.put(105, "Fatma, han, java, 2002");
        String istenenDil = "Dev";
        List<String> istenenDiliBilenlerListesi = istenenDiliBilenListesiOlustur(sinifList, istenenDil);
    }

    public static List<String> istenenDiliBilenListesiOlustur(Map<Integer, String> sinifList, String istenenDil) {
        List<String> istenenDiliBilenlerListesi = new ArrayList<>();

        istenenDiliBilenlerListesi.addAll(sinifList.values());
        int index=0;
        for (int i = 0; i < istenenDiliBilenlerListesi.size(); i++) {
            String[] temp = istenenDiliBilenlerListesi.get(i).split(", ");
            for (int j = 0; j < temp.length; j++) {
                if (temp[j].equals(istenenDil)) {
                    System.out.println(temp[0]);
                    String s = temp[0];
                  //  String temp2 [] =s;
                }
            }


        }
        return istenenDiliBilenlerListesi;
    }
}
