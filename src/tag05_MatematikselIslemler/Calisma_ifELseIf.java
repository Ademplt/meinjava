package tag05_MatematikselIslemler;

import java.util.Scanner;

public class Calisma_ifELseIf {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if (yas>=65){
            System.out.println("Emekli olabilirsiniz");
        } else if ((yas<65)&&(yas>20)){
            System.out.println("emekli olamazsiniz");
        } else {
            System.out.println("Daha gencsiniz");
        }

    }
}
