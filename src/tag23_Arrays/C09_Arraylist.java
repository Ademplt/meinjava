package tag23_Arrays;

import java.util.ArrayList;
import java.util.List;

public class C09_Arraylist<sayilar> {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        System.out.println(sayilar); //[1, 3, 5, 3, 5, 6, 1, 7]
        int ilkIndex = 2;
        int ikinciIndex = 5;
        sayilar = swapElements(sayilar, ilkIndex, ikinciIndex);

    }

    private static List<Integer> swapElements(List<Integer> sayilar, int ilkIndex, int ikinciIndex) {
        if (ilkIndex >= sayilar.size() || ikinciIndex >= sayilar.size()) {
            System.out.println("girmis oldugunuz indexler sayinin uzunlugunun disindadir");
        } else {
            System.out.println("sayilarin ilk hali : " + sayilar);
        }
        int temp = 0;
        temp = (sayilar.set(ilkIndex, sayilar.get(ikinciIndex)));
        sayilar.set(ikinciIndex, temp);

        System.out.println("sayilarin son hali : " + sayilar);

        return sayilar;
    }

}


