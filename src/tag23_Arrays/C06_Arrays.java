package tag23_Arrays;

public class C06_Arrays {
    public static void main(String[] args) {
        // verilen bir arraya yeni bir element ekleyen metod olusturun
        int arr[][] ={{3,5,7},{5,5,7}};
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i][1];

        }
        System.out.println("Arrayde ki ilk elementlerin toplami : " + toplam);

    }
}
