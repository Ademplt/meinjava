package replit5;

import java.util.ArrayList;
import java.util.List;

public class Q02_IkiArraydekiOrtakElemanlar {
    /*
    Write a program to find the common elements between two String Arrays (without case sensitivity)

   Input1 : {John,Brad,Ange,Sofia,Emily}

   Input2 : {sofia,brad,grace,emily,hazel}

   Output : [sofia,brad,emily]
     */
    public static void main(String[] args) {
        String arr1[]={"John","Brad","Ange","Sofia","Emily"};
        String arr2[]={"sofia","brad","grace","emily","hazel"};
        List<String> ortakElemanlar=new ArrayList<>();

        for (String s : arr1) {
            for (String value : arr2) {
                if (s.equalsIgnoreCase(value)) {
                    ortakElemanlar.add(s);
                }

            }

        }
        System.out.println(ortakElemanlar);
    }
}
