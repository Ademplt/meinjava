package replit5;

import kotlin.reflect.jvm.internal.impl.protobuf.ByteString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {
    /*
    write a Java program to removes a specific element from an array and
    put the remaining elements in a new array and prints the new array

    Input :{1,2,3,4,5,6}

    element:6

   Output : [1,2,3,4,5]
     */
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        List<Integer> Output = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen silinecek elemani yaziniz");
        int silinecek=scanner.nextInt();
        for (int each:arr
             ) {
            Output.add(each);

    }
        if (Output.contains(silinecek)) {
         Output.remove((Integer) silinecek);
        }else
            System.out.println("silmek istediniz eleman listede yok");

        System.out.println(Output);
    }

    }



