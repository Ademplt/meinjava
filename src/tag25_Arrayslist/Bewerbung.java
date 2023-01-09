package tag25_Arrayslist;

import java.util.Scanner;

public class Bewerbung {
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz");
        int age=scanner.nextInt();
        if (age<0){
            System.out.println("Lutfen pozitif bir yas giriniz");

        }
    }
}
