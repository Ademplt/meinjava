package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> menü = new ArrayList<>(Arrays.asList("küşleme", "adana", "trileçe", "havucDilim", "buryan",
                "yaglama", "kokareç", "arabAşı", "güveç", "waffle", "welemen", "cacix", " ", " "," "));


        Stream<String> sonuc = menü.stream().filter(String::isBlank);
        System.out.println(Arrays.toString(sonuc.toArray()));
        Long uzn = menü.stream().filter(String::isBlank).count();
        System.out.println(uzn);

    }
}
